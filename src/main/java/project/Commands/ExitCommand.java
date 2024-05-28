package project.Commands;

/**
 * The class used to call the method and display its work
 */
public class ExitCommand extends AbstractCommand{
    public ExitCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method used to end the program
     * @return void
     */
    @Override
    public String execute(String args) {
//        ConsolePrinter.messageToConsole("Программа успешно прекращена! (Без сохранения)");
        System.exit(1);
        return args;
    }
}
