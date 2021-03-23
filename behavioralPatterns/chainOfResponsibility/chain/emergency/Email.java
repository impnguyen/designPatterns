package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Email extends ForcedExecutionBaseHandler {

    @Override
    protected void executeHandler() {
                System.out.println("Email sent");
    }
    
}
