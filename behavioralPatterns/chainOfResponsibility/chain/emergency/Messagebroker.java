package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Messagebroker extends ForcedExecutionBaseHandler {

    private IForcedHandler firstMsgHandler;
    private EmergencyContext context;

    public Messagebroker(EmergencyContext emContext){
        this.context = emContext;

        this.firstMsgHandler = new Sms(this.context);
        Email mail = new Email(this.context);
        Whatsapp wa = new Whatsapp(this.context);
        Radio radio = new Radio(this.context);
        Tv tv = new Tv(this.context);
        MessageProtocol mProt = new MessageProtocol(this.context);

        this.firstMsgHandler.nextHandler(mail);
        mail.nextHandler(wa);
        wa.nextHandler(radio);
        radio.nextHandler(radio);
        radio.nextHandler(tv);
        tv.nextHandler(mProt);
    }

    @Override
    protected void executeHandler() {
        System.out.println("broker is starting...");
        this.firstMsgHandler.handleRequest();
    }
    
}
