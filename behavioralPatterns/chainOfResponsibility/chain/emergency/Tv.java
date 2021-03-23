package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Tv extends ForcedExecutionBaseHandler {

    @Override
    protected void executeHandler() {
        System.out.println("Tv sent");
    }
    
}
