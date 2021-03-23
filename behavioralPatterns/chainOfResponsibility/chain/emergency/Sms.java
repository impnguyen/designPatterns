package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Sms extends ForcedExecutionBaseHandler {
    private EmergencyContext context;

    Sms(EmergencyContext context){
        this.context = context;
    }
    @Override
    protected void executeHandler() {
        System.out.println("SMS sent with message " + this.context.getMessage());
        this.context.addToProtocol("sms: successful");
    }
    
}
