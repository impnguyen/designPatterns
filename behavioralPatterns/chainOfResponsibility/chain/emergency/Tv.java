package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Tv extends ForcedExecutionBaseHandler {
    private EmergencyContext context;

    Tv (EmergencyContext context){
        this.context = context;
    }
    @Override
    protected void executeHandler() {
        System.out.println("Tv sent with message: " + this.context.getMessage());
        this.context.addToProtocol("Tv: successful");

    }
    
}
