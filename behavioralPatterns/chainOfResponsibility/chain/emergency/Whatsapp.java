package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Whatsapp extends ForcedExecutionBaseHandler {

    @Override
    protected void executeHandler() {
        System.out.println("Whatsapp");
    }
    
}
