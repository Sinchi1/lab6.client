package project.Commands;


import project.Common.Request;

/**
 * The class used to call the method and display its work
 */
public class ClearCommand extends AbstractCommand {

    private final String commname = "clear";

    public ClearCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that admitting that collection was cleared
     * @return void
     */
    @Override
    public Request execute(String[] args) {
        return new Request(commname, args, null);

    }

}


