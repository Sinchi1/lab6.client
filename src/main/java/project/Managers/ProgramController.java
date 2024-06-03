package project.Managers;

import project.Common.Request;
import project.Common.Response;
import project.Common.User;
import project.Commands.AbstractCommand;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ProgramController {
    private final CommandManager commandManager = new CommandManager();
    private final User user;
    private final RequestSender requestSender;
    private final ResponseHandler  responseHandler = new ResponseHandler();;

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 1000;

    public ProgramController() {
        user = new User(SERVER_ADDRESS,SERVER_PORT);
        requestSender = new RequestSender(user);
    }

    public void run() {


        while(true) {
            try {
                user.run();
            } catch (IOException e) {
                ConsolePrinter.messageToConsole("Сервер не запущен");
                System.exit(1);
            }
            System.out.println("Подключение прошло успешно...");
            commandManager.cmdAdd();
                boolean isFirstCom = true;
                boolean flagSearch = false;
                Thread thread = new Thread(() -> {
                    System.out.println("\nВыход из программы");
                });
                Scanner scan = new Scanner(System.in);
                Runtime.getRuntime().addShutdownHook(thread);
                while (true) {
                    try {
                        if (!isFirstCom) {
                            ConsolePrinter.messageToConsoleWithoutLn("Ваша команда:");
                            String line = null;
                            try {
                                Thread.sleep(1);
                                line = scan.nextLine().trim();
                            } catch (NoSuchElementException | InterruptedException ignored) {
                                thread.interrupt();
                                System.exit(1);
                            }
                            if (line.equalsIgnoreCase("exit")){
                                Runtime.getRuntime().removeShutdownHook(thread);
                            }
                            String[] parts = line.split("\\s+", 2);
                            String commName = parts[0].toLowerCase();
                            if (commandManager.isCommandExists(commName)) {
                                AbstractCommand com = commandManager.getCommandByName(commName);
                                if (commandManager.isHavingArgument(commName) && (parts.length == 1)) {
                                    ConsolePrinter.messageToConsole("Вы забыли аргумент команды!");
                                    continue;
                                }
                                if ((commandManager.isHavingArgument(commName)) && (parts[1].split("\\s{1}", 2)).length > 1) {
                                    ConsolePrinter.messageToConsole("Вы перестарались и ввели лишний аргумент для команды!");
                                    continue;
                                }
                                String args = "";
                                if (commandManager.isHavingArgument(commName)) {
                                    args = parts[1];
                                }
                                Request request = com.buildCommand(commName, args);

                                if (commName.equalsIgnoreCase("exit")){
                                    Response response = requestSender.sendRequest(request);
                                    System.out.println(responseHandler.handleResponse(response));
                                    user.close();
                                }

                                if (request != null) {
                                 Response response = requestSender.sendRequest(request);
                                    System.out.println(responseHandler.handleResponse(response));

                                }

                            } else {
                                ConsolePrinter.messageToConsole("К сожалению, введённой команды не существует!");
                            }
                        } else {
                            ConsolePrinter.messageToConsole("Для использования программы нужно знать команды, чтобы ознакомиться с ними" +
                                    " введите команду help.\nЕсли же вы их знаете в добрый путь!");
                            isFirstCom = false;
                        }
                    } catch (SocketException e) {
                        ConsolePrinter.messageToConsole("Отключение от сервера, выход из программы...");
                        return;
                    } catch (IOException | ClassNotFoundException e) {
                        ConsolePrinter.messageToConsole("Произошла непридведнная ошибка");
                        return;
                    }
                }
            }
        }
    }
