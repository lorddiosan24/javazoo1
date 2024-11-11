package tn.esprit.gestionzoo.entities;

public class Terrestrial implements Omnivore<Food>{
    protected int nbrLegs;

    // Constructor
    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    // Default Constructor
    public Terrestrial() {
        this.nbrLegs = 4;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Terrestrial [Number of Legs=" + nbrLegs + "]";
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("Terrestrial animal is eating both plant and meat.");
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("Terrestrial animal is eating meat.");
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("Terrestrial animal is eating plant.");
    }
}
