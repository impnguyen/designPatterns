package structuralPatterns.composite;

public abstract class OrganisationComponent{

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public OrganisationComponent getComposite(){
        throw new UnsupportedOperationException();
    }

    public void work(){
        throw new UnsupportedOperationException();
    } 

    public OrganisationComponent getComponent(String name){
        throw new UnsupportedOperationException();
    }
    
}