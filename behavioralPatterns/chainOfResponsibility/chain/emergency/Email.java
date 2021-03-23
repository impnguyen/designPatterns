package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Email extends ForcedExecutionBaseHandler {
    private EmergencyContext context;

    Email(EmergencyContext context){
        this.context = context;
    }

    @Override
    protected void executeHandler() {
                System.out.println("Email sent with message: " + this.context.getMessage());
                this.context.addToProtocol("Email: successful");
            }
    
}
