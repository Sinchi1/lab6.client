package project.Commands;

import project.Managers.*;

/**
 * The class used to call the method and display its work
 */
public class FilterNameCommand extends AbstractCommand  {

    public FilterNameCommand(String name, String description) {
        super(name, description);
    }

    CollectionManager collectionManager;
    ConsolePrinter consolePrinter = new ConsolePrinter();
    /**
     * The method used to print the number of matches in object names
     *
     * @return void
     */
    @Override
    public String execute(String args) {
        collectionManager = CollectionManager.getInstance();
        return (collectionManager.filterByName(args));
    }

}
