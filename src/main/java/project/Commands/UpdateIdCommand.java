package project.Commands;


import project.Common.Request;

/**
 * The class used to call the method and display its work
 */
public class UpdateIdCommand extends AbstractCommand {
    String commname = "update_id";

    public UpdateIdCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that printing updated element of collection
     *
     * @return void
     */
    @Override
    public Request execute(String[] args){
        return new Request(commname, args, null);
    }
}
