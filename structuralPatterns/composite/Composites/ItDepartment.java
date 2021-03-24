package structuralPatterns.composite.Composites;
import java.util.ArrayList;
import java.util.Objects;

import structuralPatterns.composite.OrganisationComponent;

public class ItDepartment extends OrganisationComponent{
    
    private String name;
    private ArrayList<OrganisationComponent> orgComponents = new ArrayList<>(); 

    public ItDepartment(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }  

    public void addOrganisationComponent(OrganisationComponent orgComponent){
        Objects.requireNonNull(orgComponent, "is not a valid organisation component");

        this.orgComponents.add(orgComponent);
    }

    public OrganisationComponent getComposite(){
        return this;
    }

    public void work(){
        System.out.println("department: " + this.name + " starts working");
        System.out.println("--------------------------------------------");
        for (OrganisationComponent organisationComponent : orgComponents) {
            organisationComponent.work();
        }
    }

    /*todo: error in search method*/
    @Override
    public OrganisationComponent getComponent(String name){
        for (OrganisationComponent organisationComponent : orgComponents) {
            if(organisationComponent.getName() == name){
                return organisationComponent;
            }else if(organisationComponent.getComposite() != null){
                ((ItDepartment) organisationComponent).getComponent(name);
            }
        }

        return null;
    }

}
