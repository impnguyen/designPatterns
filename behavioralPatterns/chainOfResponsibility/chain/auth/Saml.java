package behavioralPatterns.chainOfResponsibility.chain.auth;

import java.util.Arrays;
import java.util.List;

import behavioralPatterns.chainOfResponsibility.BaseHandler;
import behavioralPatterns.chainOfResponsibility.AuthType;

public class Saml extends BaseHandler {

    public static final int V1 = 1, V2 = 2;
    private int version;

    public Saml(int version){
        if (version != V1 &&
            version != V2 ){
                throw new IllegalArgumentException("not supported protocol");
        }else{
            this.version = version;
        }
    }

    @Override
    protected List<AuthType> getSupportedAuthType() {
        return Arrays.asList(
            AuthType.SAML, 
            AuthType.SAML2
        );
    }

    @Override
    protected void executeHandler(AuthType authType) {
        switch (authType) {
            case SAML:
                System.out.println("authentication by saml 1 protocol successful ");
                break;
            
            case SAML2:
                System.out.println("authentication by saml 2 protocol successful ");
                break;
        
            default:
                break;
        }
    }
    
}
