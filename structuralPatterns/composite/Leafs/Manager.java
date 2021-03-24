package structuralPatterns.composite.Leafs;

import structuralPatterns.composite.OrganisationComponent;

public class Manager extends OrganisationComponent{
    
    private String name;

    public Manager(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public OrganisationComponent getComposite(){
        return null;
    }

    public void work(){
        System.out.println("manager: " + this.name + " starts delegating");
    }

    @Override
    public OrganisationComponent getComponent(String name){
        if(this.getName() == name){
            return this;
        }else{
            return null;
        }
    }

}
