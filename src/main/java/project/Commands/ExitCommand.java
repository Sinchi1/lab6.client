package project.Commands;

import project.Common.Request;
import project.Managers.ConsolePrinter;
import project.Managers.RequestSender;

/**
 * The class used to call the method and display its work
 */
public class ExitCommand extends AbstractCommand{
    public ExitCommand(String name, String description) {
        super(name, description);
    }

    String commname = "save";

    /**
     * The method used to end the program
     * @return void
     */
    @Override
    public Request execute(String[] args) {
        return new Request(commname, args, null);
    }
}
