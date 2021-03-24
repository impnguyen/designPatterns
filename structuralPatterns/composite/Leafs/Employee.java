package structuralPatterns.composite.Leafs;
import structuralPatterns.composite.OrganisationComponent;

public class Employee extends OrganisationComponent {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }  

    public OrganisationComponent getComposite(){
        return null;
    }

    public void work(){
        System.out.println("employee: " + this.name + " starts working");
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
