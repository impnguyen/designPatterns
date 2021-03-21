package behavioralPatterns.command;

public class BulbContext implements IExecutionContext {

    private int bulbId;

    public BulbContext(int bulbId){
        this.bulbId = bulbId;
    }

    public int getBulbId() {
        return bulbId;
    }

    @Override
    public IExecutionContext getContext() {
        
        return this;
    }

}