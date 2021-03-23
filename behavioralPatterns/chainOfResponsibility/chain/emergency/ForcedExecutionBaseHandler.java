package behavioralPatterns.chainOfResponsibility.chain.emergency;

import java.util.Objects;

public abstract class ForcedExecutionBaseHandler implements IForcedHandler {

    private IForcedHandler nextHandler;
    abstract protected void executeHandler();

    public void handleRequest(){
        executeHandler();

        if(!Objects.isNull(this.nextHandler)){
            this.nextHandler.handleRequest();
        }
    }

    public void nextHandler(IForcedHandler nextHandler){
        this.nextHandler = nextHandler;
    }


}