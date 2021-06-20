package isep.eapli.demo_orm;

import javax.persistence.*;

@Entity
public class GrupoAutomovel {

    private String classe;

    private int numberOfDoors;
private double 
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
