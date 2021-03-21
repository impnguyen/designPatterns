package behavioralPatterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import behavioralPatterns.command.ICommand;

public class Invoker{
    // list of commands
    private List<ICommand> commandoList = new ArrayList<>();

    public void registerCommand(ICommand commando){
        Objects.requireNonNull(commando, "commando is invalid");

        this.commandoList.add(commando);
    }

    public void startExecution(){
        for (ICommand iCommand : commandoList) {
            iCommand.execute();
        }
    }

}