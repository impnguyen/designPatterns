package  behavioralPatterns.command.receivers;

public class Smartbulb{

    private int bulbId;
    private boolean isOn;

    public Smartbulb(int bulbId){
        this.bulbId = bulbId;
    }

    public void turnOn(){
        this.isOn = true;
        System.out.println(this.getLog());
    }

    public void turnOff(){
        this.isOn = false;
        System.out.println(this.getLog());
    }
    
    public String getLog(){
       return "bulb with id " + this.bulbId + " is turned on: " + this.isOn;
    }

}