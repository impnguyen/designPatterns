package behavioralPatterns.chainOfResponsibility.chain.emergency;

public interface IForcedHandler{

    public void handleRequest();
    public void nextHandler(IForcedHandler nextHandler);

}