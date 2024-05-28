package project.Commands;

import project.Managers.*;


import java.util.Iterator;
import java.util.LinkedList;
/**
 * The class used to call the method and display its work
 */
public class RemoveByIdCommand extends AbstractCommand {

    public RemoveByIdCommand(String name, String description) {
        super(name, description);
    }
    CollectionManager collectionManager;

    ConsolePrinter consolePrinter = new ConsolePrinter();
    /**
     * The method that printing information about deleted element of collection
     * @return void
     */
    @Override
    public String execute(String args) {
        collectionManager = CollectionManager.getInstance();
        return (collectionManager.removeById(args).toString().replaceAll("^\\[|\\]$", ""));
    }
}
