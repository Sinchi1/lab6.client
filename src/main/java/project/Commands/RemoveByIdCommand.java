package project.Commands;


/**
 * The class used to call the method and display its work
 */
public class RemoveByIdCommand extends AbstractCommand {

    public RemoveByIdCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that printing information about deleted element of collection
     * @return void
     */
    @Override
    public String execute(String args) {
        return "";
    }
}
