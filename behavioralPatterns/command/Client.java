package behavioralPatterns.command;

import java.util.ArrayList;
import java.util.List;

import behavioralPatterns.command.commands.GoodnightMacroCommand;
import behavioralPatterns.command.commands.TurnOffSmartBulb;
import behavioralPatterns.command.commands.TurnOnSmartBulb;

public class Client {
    public static void main (String args[]){
        System.out.println("------------------ first scenario: simple ------------------");
        BulbContext bulbContext = new BulbContext(834798);
        Invoker smarthomeSleepingRoomRemote = new Invoker();

        TurnOnSmartBulb turnOn = new TurnOnSmartBulb(bulbContext);
        TurnOffSmartBulb turnOff = new TurnOffSmartBulb(bulbContext);

        smarthomeSleepingRoomRemote.registerCommand(turnOn);
        smarthomeSleepingRoomRemote.registerCommand(turnOff);
        smarthomeSleepingRoomRemote.startExecution();

        System.out.println("------------------ second scenario: macro command ------------------");
        List<BulbContext> bulbsToTurnOff = new ArrayList<>();
        List<BulbContext> bulbsToTurnOn = new ArrayList<>();

        bulbsToTurnOff.add(new BulbContext(7384273));
        bulbsToTurnOff.add(new BulbContext(346273));
        bulbsToTurnOff.add(new BulbContext(89859));
        bulbsToTurnOff.add(new BulbContext(2632));
        bulbsToTurnOff.add(new BulbContext(96895));

        bulbsToTurnOn.add(new BulbContext(26356324));
        bulbsToTurnOn.add(new BulbContext(23847));

        
        GoodnightMacroCommand goodNight = new GoodnightMacroCommand(bulbsToTurnOn, bulbsToTurnOff);
        goodNight.execute();

        System.out.println("------------------ third scenario: undo macro command ------------------");
        goodNight.unexecute();

    }
}