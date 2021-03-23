package behavioralPatterns.chainOfResponsibility.chain.emergency;


public class Messagebroker extends ForcedExecutionBaseHandler {

    private IForcedHandler firstMsgHandler;

    public Messagebroker(){
        this.firstMsgHandler = new Sms();
        Email mail = new Email();
        Whatsapp wa = new Whatsapp();
        Radio radio = new Radio();
        Tv tv = new Tv();

        this.firstMsgHandler.nextHandler(mail);
        mail.nextHandler(wa);
        wa.nextHandler(radio);
        radio.nextHandler(radio);
        radio.nextHandler(tv);
    }

    @Override
    protected void executeHandler() {
        System.out.println("broker is starting...");
        this.firstMsgHandler.handleRequest();
    }
    
}
