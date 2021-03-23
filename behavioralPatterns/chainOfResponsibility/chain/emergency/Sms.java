package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Sms extends ForcedExecutionBaseHandler {

    @Override
    protected void executeHandler() {
        System.out.println("SMS sent");
    }
    
}
