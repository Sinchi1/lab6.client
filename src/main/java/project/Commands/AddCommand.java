package project.Commands;


import java.io.IOException;
/**
 * The class used to call the method and display its work
 */
public class AddCommand extends AbstractCommand {

    public AddCommand(String name, String description) {
        super(name, description);
    }
    /**
     * The method that admitting to user new files of collection
     * @return void
     */
    @Override
    public String execute(String args) throws IOException {

        return ("Вы успешно создали элемент коллекции!");
    }
}