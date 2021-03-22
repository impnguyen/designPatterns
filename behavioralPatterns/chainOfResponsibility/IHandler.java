package behavioralPatterns.chainOfResponsibility;

public interface IHandler{

    public void handleRequest(AuthType authType);
    public void nextHandler(IHandler nextHandler);

}