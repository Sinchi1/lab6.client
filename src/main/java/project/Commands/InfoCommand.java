package project.Commands;


/**
 * The class used to call the method and display its work
 */
public class InfoCommand extends AbstractCommand {

    public InfoCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that printing all information about collection
     * @return void
     */
    @Override
    public String execute(String args) {
       return "";
    }

}
