package project.Commands;

import project.Managers.*;
/**
 * The class used to call the method and display its work
 */
public class RemoveOscarCountCommand extends AbstractCommand {

    public RemoveOscarCountCommand(String name, String description) {
        super(name, description);
    }

    CollectionManager collectionManager;

    ConsolePrinter consolePrinter = new ConsolePrinter();
    /**
     * The method that printing information about deleted elements,which contained right amout of Oscars
     * @return void
     */
    @Override
    public String  execute(String args) {
        collectionManager = CollectionManager.getInstance();
        return (collectionManager.removeOscar(args).toString().replaceAll("^\\[|\\]$", ""));
    }

}
