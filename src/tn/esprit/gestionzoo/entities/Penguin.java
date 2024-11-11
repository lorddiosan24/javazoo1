package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    // Parameterized Constructor
    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Default Constructor
    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Penguin [Habitat=" + habitat + ", Swimming Depth=" + swimmingDepth + "]";
    }
}
