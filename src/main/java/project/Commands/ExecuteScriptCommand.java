package project.Commands;


import project.Common.Request;

import java.io.IOException;
/**
 * The class used to call the method and display its work
 */
public class ExecuteScriptCommand extends AbstractCommand{
    public ExecuteScriptCommand(String name, String description) {
        super(name, description);
    }

    /**
     * The method used to execute scripts
     * @return void
     */
    @Override
    public Request execute(String[] args) throws IOException {
//        programRunner.runOnce(args);
        return null;
    }
}
