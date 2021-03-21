package behavioralPatterns.command.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import behavioralPatterns.command.BulbContext;
import behavioralPatterns.command.ICommand;
import behavioralPatterns.command.IExecutionContext;

public class GoodnightMacroCommand implements ICommand{
    
    private List<BulbContext> bulbContextsOn = new ArrayList<>();
    private List<BulbContext> bulbContextsOff = new ArrayList<>();

    private IExecutionContext initContext = new BulbContext(0);

    private TurnOnSmartBulb turnOn  = new TurnOnSmartBulb(initContext);
    private TurnOffSmartBulb turnOff  = new TurnOffSmartBulb(initContext);

    public GoodnightMacroCommand(List<BulbContext> bulbContextsOn, List<BulbContext> bulbContextsOff){
        for (BulbContext bulbContext : bulbContextsOn) {
            Objects.requireNonNull(bulbContext, "bulb context is invalid");

            this.bulbContextsOn.add(bulbContext);
        }

        for (BulbContext bulbContext : bulbContextsOff) {
            Objects.requireNonNull(bulbContext, "bulb context is invalid");

            this.bulbContextsOff.add(bulbContext);
        }
    }

    @Override
    public void execute() {
        for (BulbContext bulbContext : bulbContextsOn) {
            turnOn.setContext(bulbContext);
            turnOn.execute();
        }

        for (BulbContext bulbContext : bulbContextsOff) {
            turnOff.setContext(bulbContext);
            turnOff.execute();
        }
    }

    @Override
    public void unexecute() {
        for (BulbContext bulbContext : bulbContextsOn) {
            turnOff.setContext(bulbContext);
            turnOff.execute();
        }

        for (BulbContext bulbContext : bulbContextsOff) {
            turnOn.setContext(bulbContext);
            turnOn.execute();
        }
    }

}