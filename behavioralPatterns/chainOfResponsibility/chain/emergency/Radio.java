package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Radio extends ForcedExecutionBaseHandler {

    @Override
    protected void executeHandler() {
        System.out.println("Radio sent");
    }
    
}
