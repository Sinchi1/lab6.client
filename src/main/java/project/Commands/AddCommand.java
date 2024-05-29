package project.Commands;


import project.Common.Request;

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
    public Request execute(String[] args) throws IOException {

        return null;
    }
}