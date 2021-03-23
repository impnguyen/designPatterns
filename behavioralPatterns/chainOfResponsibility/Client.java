package behavioralPatterns.chainOfResponsibility;

import behavioralPatterns.chainOfResponsibility.chain.auth.Base;
import behavioralPatterns.chainOfResponsibility.chain.auth.OAuth;
import behavioralPatterns.chainOfResponsibility.chain.auth.Saml;
import behavioralPatterns.chainOfResponsibility.chain.emergency.Email;
import behavioralPatterns.chainOfResponsibility.chain.emergency.Messagebroker;
import behavioralPatterns.chainOfResponsibility.chain.emergency.Sms;
import behavioralPatterns.chainOfResponsibility.chain.auth.AuthType;

public class Client{

    public static void main (String args []){
        System.out.println("------------------ first scenario: simple  auth chain ------------------");
        Base baseAuth = new Base();
        OAuth oAuth = new OAuth(OAuth.V1);
        OAuth oAuth2 = new OAuth(OAuth.V2);
        Saml saml = new Saml(Saml.V1);
        Saml saml2 = new Saml(Saml.V2);

        baseAuth.nextHandler(oAuth2);
        oAuth2.nextHandler(oAuth);
        oAuth.nextHandler(saml);
        saml.nextHandler(saml2);

        //the client try to authenticate with saml 1 request
        baseAuth.handleRequest(AuthType.SAML);

        System.out.println("------------------ second scenario: forced emergency chain ------------------");
        Messagebroker broker = new Messagebroker();
        broker.handleRequest();


    }
}