package project.Commands;


import project.Collections.Movie;
import project.Common.Request;
import project.Readers.MovieReader;

/**
 * The class used to call the method and display its work
 */
public class UpdateIdCommand extends AbstractCommand {
    String commname = "update_id";

    MovieReader movieReader = new MovieReader();



    public UpdateIdCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that printing updated element of collection
     *
     * @return void
     */
    @Override
    public Request execute(String args){
        int id = Integer.parseInt(args);
        Movie mov1 = movieReader.readMovie();
        mov1.setId(id);
        return new Request(commname,mov1);
    }
}
