package behavioralPatterns.command;

import behavioralPatterns.command.commands.TurnOffSmartBulb;
import behavioralPatterns.command.commands.TurnOnSmartBulb;

public class Client {
    public static void main (String args[]){
        System.out.println("------------------");

        // first scenario: simple
        BulbContext bulbContext = new BulbContext(834798);
        Invoker smarthomeSleepingRoomRemote = new Invoker();

        TurnOnSmartBulb turnOn = new TurnOnSmartBulb(bulbContext);
        TurnOffSmartBulb turnOff = new TurnOffSmartBulb(bulbContext);

        smarthomeSleepingRoomRemote.registerCommand(turnOn);
        smarthomeSleepingRoomRemote.registerCommand(turnOff);
        smarthomeSleepingRoomRemote.startExecution();

        System.out.println("------------------");

        // second scenario: macro command

    }
}