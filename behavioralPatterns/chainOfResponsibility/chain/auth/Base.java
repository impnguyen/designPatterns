package behavioralPatterns.chainOfResponsibility.chain.auth;

import java.util.Arrays;
import java.util.List;

public class Base extends BaseHandler {

    @Override
    protected List<AuthType> getSupportedAuthType() {
        return Arrays.asList(
            AuthType.BASIC
        );
    }

    @Override
    protected void executeHandler(AuthType authType) {
        switch (authType) {
            case BASIC:
                System.out.println("authentication by basic protocol successful ");
                break;
        
            default:
                break;
        }
    }
    
}
