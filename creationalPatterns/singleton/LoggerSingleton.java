package creationalPatterns.singleton;

public final class LoggerSingleton {
    
    public static final LoggerSingleton INSTANCE = new LoggerSingleton();

    private int numberOfAccess;
    private String description = "This is a central logger. Usage: Singleton pattern";

    public static int getNumberOfAccesses(){
        return INSTANCE.numberOfAccess;
    }

    public void log(String message){
        this.numberOfAccess ++;
        System.out.println("INFO:" + message);
    }

    public String getDescr(){
        this.numberOfAccess ++;
        return this.description;
    }

}
