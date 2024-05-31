package project.Common;

import project.Commands.AbstractCommand;
import project.Managers.CommandManager;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

public class Request implements Serializable {
    @Serial
    private static final long serialVersionUID = 1404L;
    private final String commandName;
    private final String[] commandStringArgument;
    private final Serializable commandObjectArgument;

    CommandManager commandManager = new CommandManager();

    public Request(String commandName, String[] commandStringArgument, Serializable commandObjectArgument) {
        this.commandName = commandName;
        this.commandStringArgument = commandStringArgument;
        this.commandObjectArgument = commandObjectArgument;
    }

    public String getCommandName() {
        return commandName;
    }

    public String[] getCommandStringArgument() {
        return commandStringArgument;
    }

    public boolean isEmpty() {
        return commandName.isEmpty() && commandStringArgument.length == 0 ;
    }

    public Serializable getCommandObjectArgument() {
        return commandObjectArgument;
    }

}
