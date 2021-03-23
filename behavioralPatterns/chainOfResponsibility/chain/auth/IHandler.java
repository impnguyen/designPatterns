package behavioralPatterns.chainOfResponsibility.chain.auth;

public interface IHandler{

    public void handleRequest(AuthType authType);
    public void nextHandler(IHandler nextHandler);

}