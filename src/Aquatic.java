public class Aquatic {
    protected String habitat;

    // Constructor
    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    // Default Constructor
    public Aquatic() {
        this.habitat = "Unknown habitat";
    }

    // Swim method
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return "Aquatic [Habitat=" + habitat + "]";
    }
}
