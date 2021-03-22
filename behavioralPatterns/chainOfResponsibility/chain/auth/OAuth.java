package behavioralPatterns.chainOfResponsibility.chain.auth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import behavioralPatterns.chainOfResponsibility.AuthType;
import behavioralPatterns.chainOfResponsibility.BaseHandler;

public class OAuth extends BaseHandler{

    public static final int V1 = 1, V2 = 2;
    private int version;

    @Override
    protected List<AuthType> getSupportedAuthType() {
        return Arrays.asList(
            AuthType.OAUTH1,
            AuthType.OAUTH2
        );
    }

    public OAuth(int version){
        if (version != V1 &&
            version != V2 ){
                throw new IllegalArgumentException("not supported protocol");
        }else{
            this.version = version;
        }
    }

    @Override
    protected void executeHandler(AuthType authType) {
        switch (authType) {
            case OAUTH1:
                System.out.println("authentication by oauth 1 protocol successful ");
                break;
            
            case OAUTH2:
                System.out.println("authentication by oauth 2 protocol successful ");
                break;
        
            default:
                break;
        }
    }
    
}
