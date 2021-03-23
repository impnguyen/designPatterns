package behavioralPatterns.chainOfResponsibility.chain.emergency;

import java.util.ArrayList;
import java.util.List;

public class EmergencyContext {
    
    private String message;
    private List<String> protocol = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addToProtocol(String protocolMessage){
        this.protocol.add(protocolMessage);
    }

    public List<String> getProtocol(){
        return this.protocol;
    }

}
