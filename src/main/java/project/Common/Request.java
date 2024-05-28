package project.Common;

import java.io.Serial;
import java.io.Serializable;

public class Request implements Serializable {
    @Serial
    private static final long serialVersionUID = 1404L;
    private final String commandName;
    private final String commandStringArgument;
    private Serializable commandObjectArgument;
    private User user;

    public Request(String commandName, String commandStringArgument, Serializable commandObjectArgument, User user) {
        this.commandName = commandName;
        this.commandStringArgument = commandStringArgument;
        this.commandObjectArgument = commandObjectArgument;
        this.user = user;
    }

    public String getCommandName() {
        return commandName;
    }

    public String getCommandStringArgument() {
        return commandStringArgument;
    }

    public boolean isEmpty() {
        return commandName.isEmpty() && commandStringArgument.isEmpty() ;
    }

    public Serializable getCommandObjectArgument() {
        return commandObjectArgument;
    }

    public User getUser() {
        return user;
    }
}
