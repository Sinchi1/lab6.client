package project.Commands;


/**
 * The class used to call the method and display its work
 */
public class ClearCommand extends AbstractCommand {

    public ClearCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that admitting that collection was cleared
     * @return void
     */
    @Override
    public String execute(String args) {
        return "";
    }

}


