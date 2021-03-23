package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class MessageProtocol extends ForcedExecutionBaseHandler {
    private EmergencyContext context;

    MessageProtocol(EmergencyContext context){
        this.context = context;
    }

    @Override
    protected void executeHandler() {
        this.printProtocol();
    }

    private void printProtocol(){
        System.out.println("------------------ protocol start");
        for (String protocolMsg : this.context.getProtocol()) {
            System.out.println(protocolMsg);
        }
        System.out.println("------------------ protocol end");
    }
    
}
