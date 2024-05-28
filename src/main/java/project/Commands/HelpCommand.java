package project.Commands;

/**
 * The class used to call the method and display its work
 */
public class HelpCommand extends AbstractCommand  {

    public HelpCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that printing all commands of the programm
     * @return void
     */
    @Override
    public String execute(String args) {
        return "";
    }

}
