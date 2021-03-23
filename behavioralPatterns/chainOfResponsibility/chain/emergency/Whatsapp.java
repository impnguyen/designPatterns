package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Whatsapp extends ForcedExecutionBaseHandler {
    private EmergencyContext context;

    Whatsapp(EmergencyContext context){
        this.context = context;
    }
    @Override
    protected void executeHandler() {
        System.out.println("Whatsapp sent with message " + this.context.getMessage());
        this.context.addToProtocol("whatsapp: successful");
    }
    
}
