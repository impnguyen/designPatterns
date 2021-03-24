package structuralPatterns.composite;

import structuralPatterns.composite.Composites.*;
import structuralPatterns.composite.Leafs.Employee;
import structuralPatterns.composite.Leafs.Manager;


public class Client{

    public static void main (String args[]){
        System.out.println("------------------ first scenario simple ------------------");

        OrganisationComponent itUnlimitedCorporation = new ItDepartment("IT Unlimited Corporation");
        OrganisationComponent sapDevTeam = new ItDepartment("SAP");
        OrganisationComponent webDevTeam = new ItDepartment("Web Development");
        OrganisationComponent sapBase = new ItDepartment("Basic Administration");

        if(itUnlimitedCorporation.getComposite() != null){
            ((ItDepartment) itUnlimitedCorporation).addOrganisationComponent(sapDevTeam);
            ((ItDepartment) itUnlimitedCorporation).addOrganisationComponent(webDevTeam);

            if(sapDevTeam.getComposite() != null){
                ((ItDepartment) sapDevTeam).addOrganisationComponent(new Employee("Bernd Brot"));
                ((ItDepartment) sapDevTeam).addOrganisationComponent(new Employee("Arni Brot"));
                ((ItDepartment) sapDevTeam).addOrganisationComponent(new Employee("Lorena Bizotto"));
                ((ItDepartment) sapDevTeam).addOrganisationComponent(sapBase);
    
                if(sapBase.getComposite() != null){
                    ((ItDepartment) sapBase).addOrganisationComponent(new ItDepartment("SAP Basic Administration"));
                    ((ItDepartment) sapBase).addOrganisationComponent(new Employee("Carolin Maier"));
                    ((ItDepartment) sapBase).addOrganisationComponent(new Employee("Tasty Benua"));
                    ((ItDepartment) sapBase).addOrganisationComponent(new Employee("Judi King"));
                }
            }
            
            if(webDevTeam.getComposite() != null){
                ((ItDepartment) webDevTeam).addOrganisationComponent(new Manager("Heiko King"));
                ((ItDepartment) webDevTeam).addOrganisationComponent(new Employee("Judi King"));
                ((ItDepartment) webDevTeam).addOrganisationComponent(new Employee("Nicolas Mustermann"));
                ((ItDepartment) webDevTeam).addOrganisationComponent(new Employee("Benett Pipe"));
                ((ItDepartment) webDevTeam).addOrganisationComponent(new Employee("Prulue Ancoda"));
            }
        }

        itUnlimitedCorporation.work();

        //error
        System.out.println("------------------ second scenario simple ------------------");
        var judiKing = ((ItDepartment) itUnlimitedCorporation).getComponent("Basic Administration");
        if(judiKing != null){
            System.out.println(judiKing.getName() + " was found.");
        }else{
            System.out.println("not found");
        }
    }

}