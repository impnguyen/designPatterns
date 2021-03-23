package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Radio extends ForcedExecutionBaseHandler {
    private EmergencyContext context;

    Radio(EmergencyContext context){
        this.context = context;
    }
    @Override
    protected void executeHandler() {
        System.out.println("Radio sent with message: " + this.context.getMessage());
        this.context.addToProtocol("Radio: successful");

    }
    
}
