package project.Commands;

import project.Managers.*;

/**
 * The class used to call the method and display its work
 */
public class ShowCommand extends AbstractCommand {

    public ShowCommand(String name, String description) {
        super(name, description);
    }

    CollectionManager collectionManager;
    /**
     * The method that printing all elements of collection
     * @return void
     */
    @Override
    public String execute(String args) {
       collectionManager = CollectionManager.getInstance();
       return collectionManager.showAllElements();
    }

}
