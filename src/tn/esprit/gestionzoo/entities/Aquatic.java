package tn.esprit.gestionzoo.entities;

public abstract class Aquatic implements Carnivore<Food> {
    protected String habitat;

    // Parameterized Constructor
    public Aquatic(String habitat) {
        if (habitat == null || habitat.isEmpty()) {
            throw new IllegalArgumentException("Habitat cannot be null or empty.");
        }
        this.habitat = habitat;
    }

    // Default Constructor
    public Aquatic() {
        this.habitat = "Unknown habitat";
    }

    // Getter for habitat
    public String getHabitat() {
        return habitat;
    }

    // Setter for habitat
    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isEmpty()) {
            throw new IllegalArgumentException("Habitat cannot be null or empty.");
        }
        this.habitat = habitat;
    }

    // Abstract swim method (to be implemented by subclasses)
    public abstract void swim();

    // Implement Carnivore's eatMeat method
    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT) {
            System.out.println("This aquatic animal is eating meat.");
        } else {
            System.out.println("This aquatic animal cannot eat " + food + ".");
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Aquatic [Habitat=" + habitat + "]";
    }
}
