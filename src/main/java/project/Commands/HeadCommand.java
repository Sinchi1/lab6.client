package project.Commands;

/**
 * The class used to call the method and display its work
 */
public class HeadCommand extends AbstractCommand  {
    public HeadCommand(String name, String description) {
        super(name, description);
    }
    /**
     * The method used to print first element of collection
     * @return void
     */
    @Override
    public String execute(String args) {
        return "";
    }

}
