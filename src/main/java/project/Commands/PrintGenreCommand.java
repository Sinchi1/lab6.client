package project.Commands;

import project.Managers.*;

import java.util.LinkedList;
/**
 * The class used to call the method and display its work
 */
public class PrintGenreCommand extends AbstractCommand  {

    public PrintGenreCommand(String name, String description) {
        super(name, description);
    }

    CollectionManager collectionManager;

    ConsolePrinter consolePrinter = new ConsolePrinter();
    /**
     * The method that creates new files of collection
     * @return void
     */
    @Override
    public String execute(String args) {
        collectionManager = CollectionManager.getInstance();
        return collectionManager.getCollectionGenres().toString().replaceAll("^\\[|\\]$", "");
    }
}
