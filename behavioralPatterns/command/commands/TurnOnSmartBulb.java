package  behavioralPatterns.command.commands;

import java.util.Objects;

import behavioralPatterns.command.BulbContext;
import behavioralPatterns.command.ICommand;
import behavioralPatterns.command.IExecutionContext;
import behavioralPatterns.command.receivers.Smartbulb;

public class TurnOnSmartBulb implements ICommand{

    private IExecutionContext context;

    public void setContext(IExecutionContext context){
        Objects.requireNonNull(context, "bulb context is invalid");
        this.context = context;
    }

    public TurnOnSmartBulb(IExecutionContext bulbContext){
        Objects.requireNonNull(bulbContext, "Context is invalid");
    
        this.context = bulbContext;
    }

    @Override
    public void execute() {
        Smartbulb bulb = new Smartbulb(
            ((BulbContext) this.context.getContext()).getBulbId()
        );

        bulb.turnOn();
    }

    @Override
    public void unexecute() {
        Smartbulb bulb = new Smartbulb(
            ((BulbContext) this.context.getContext()).getBulbId()
        );

        bulb.turnOff();
    }

}