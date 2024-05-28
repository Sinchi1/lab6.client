package project.Commands;

import project.Managers.*;
import project.ProgrammEnums.ProgrammState;
import project.Readers.*;
import project.Collections.Movie;

import java.io.IOException;
/**
 * The class used to call the method and display its work
 */
public class AddCommand extends AbstractCommand {

    public AddCommand(String name, String description) {
        super(name, description);
    }
    CollectionManager collectionManager;

    MovieReader reader = new MovieReader();

    ProgrammStateManager programmStateManager = ProgrammStateManager.getInstance();
    /**
     * The method that admitting to user new files of collection
     * @return void
     */
    @Override
    public String execute(String args) throws IOException {
        collectionManager = CollectionManager.getInstance();
        Movie mov1;
        if (programmStateManager.getProgrammState() == ProgrammState.PROGRAMM_STATE_ACTIVE){
            mov1 = reader.readMovie(args);
        }
        else{mov1 = reader.readMovieFromFile(args);}
        collectionManager.putMovieInCollection(mov1);
        return ("Вы успешно создали элемент коллекции!");
    }
}