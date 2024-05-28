package project.Commands;

import project.Managers.*;
import project.ProgrammEnums.ProgrammState;
import project.Readers.*;
import project.Collections.Movie;

import java.io.IOException;
/**
 * The class used to call the method and display its work
 */
public class UpdateIdCommand extends AbstractCommand {

    public UpdateIdCommand(String name, String description) {
        super(name, description);
    }

    CollectionManager collectionManager;

    ProgrammStateManager programmStateManager;

    MovieReader reader = new MovieReader();
    /**
     * The method that printing updated element of collection
     * @return void
     */
    @Override
    public String execute(String args) throws IOException {
        try{
            programmStateManager = ProgrammStateManager.getInstance();
            collectionManager = CollectionManager.getInstance();
            int id = Integer.parseInt(args);
            Movie mov1 = collectionManager.getMovieByid(args);
            String filmName = mov1.getName();
            if (programmStateManager.getProgrammState() == ProgrammState.PROGRAMM_STATE_ACTIVE) {
                mov1 = reader.readMovie(args);
            } else {
                mov1 = reader.readMovieFromFile(args);
            }
            mov1.setId(id);
            mov1.setName(filmName);
            collectionManager.replaceMovieInCollectionById(id, mov1);
            return ("Элемент коллекции по id: "+args + " успешно обновлён!");
        }
        catch (NullPointerException ignored){
        }
        return null;
    }
    }


