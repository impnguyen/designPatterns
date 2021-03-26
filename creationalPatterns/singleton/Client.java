package creationalPatterns.singleton;

public class Client {
    public static void main (String args[]){
        System.out.println("------------------------------------");
        System.out.println("number of accesses: " + LoggerSingleton.getNumberOfAccesses());
        System.out.println("------------------------------------");


        LoggerSingleton.INSTANCE.log("first access");
        LoggerSingleton.INSTANCE.log("second access");
        LoggerSingleton.INSTANCE.log("third access");
        System.out.println("Print logger descr: " + LoggerSingleton.INSTANCE.getDescr());
        LoggerSingleton.INSTANCE.log("fifth access");

        System.out.println("------------------------------------");
        System.out.println("number of accesses: " + LoggerSingleton.getNumberOfAccesses());
        System.out.println("------------------------------------");
    }
}
