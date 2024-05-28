package project.Commands;

/**
 * The class used to call the method and display its work
 */
public class RemoveOscarCountCommand extends AbstractCommand {

    public RemoveOscarCountCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that printing information about deleted elements,which contained right amout of Oscars
     * @return void
     */
    @Override
    public String  execute(String args) {
        return "";
    }

}
