package project.Commands;

import com.fasterxml.jackson.core.JsonProcessingException;
import project.Common.Request;

import java.io.IOException;

/**
 * The class used to call the method and display its work
 */
public class SaveCommand extends AbstractCommand {

    public SaveCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method that printing all removed elements above under integer
     * @return void
     */
    @Override
    public Request execute(String[] args) {
        return new Request("save", args, null);

    }

}
