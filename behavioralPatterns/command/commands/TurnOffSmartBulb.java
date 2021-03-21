package  behavioralPatterns.command.commands;

import java.util.Objects;
import behavioralPatterns.command.BulbContext;
import behavioralPatterns.command.ICommand;
import behavioralPatterns.command.IExecutionContext;
import behavioralPatterns.command.receivers.Smartbulb;

public class TurnOffSmartBulb implements ICommand{

    private IExecutionContext context;

    public TurnOffSmartBulb(IExecutionContext bulbContext){
        Objects.requireNonNull(bulbContext, "Context ist invalid");
    
        this.context = bulbContext;
    }

    @Override
    public void execute() {
        Smartbulb bulb = new Smartbulb(
            ((BulbContext) this.context.getContext()).getBulbId()
        );

        bulb.turnOff();
    }

    @Override
    public void unexecute() {
        Smartbulb bulb = new Smartbulb(
            ((BulbContext) this.context.getContext()).getBulbId()
        );

        bulb.turnOn();
    }

}