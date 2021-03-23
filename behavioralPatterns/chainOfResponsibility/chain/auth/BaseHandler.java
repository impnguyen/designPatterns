package behavioralPatterns.chainOfResponsibility.chain.auth;

import java.util.List;
public abstract class BaseHandler implements IHandler {

    private IHandler nextHandler;

    abstract protected List<AuthType> getSupportedAuthType();
    abstract protected void executeHandler(AuthType authType);

    @Override
    public void handleRequest(AuthType authType){
        if(this.getSupportedAuthType().contains(authType)){
            executeHandler(authType);
        }else{
            System.out.println("protocol " + authType + " is not relevant and supported by " + this.getClass().getName() + " for request ");
            nextHandler.handleRequest(authType);
        }
    }

    @Override
    public void nextHandler(IHandler nextHandler){
        this.nextHandler = nextHandler;
    }


}