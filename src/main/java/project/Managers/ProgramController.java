package project.Managers;

import project.Common.User;

import java.io.IOException;

public class ProgramController {
    private final CommandManager commandManager;
    ConsolePrinter consolePrinter = new ConsolePrinter();
    private final User user;
    private final RequestSender requestSender;
    private final ResponseHandler responseHandler;

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 1000;

    public ProgramController() {
        commandManager = new CommandManager();
        user = new User(SERVER_ADDRESS,SERVER_PORT);
        requestSender = new RequestSender(user);
        responseHandler = new ResponseHandler();
    }

    public void run() {

        try {
            user.run();
        } catch (IOException e) {
            ConsolePrinter.messageToConsole("Сервер не запущен");
            System.exit(1);
        }

        ConsolePrinter.messageToConsole("Программа запущена\nДля получения списка команд напишите: help");


    }
}