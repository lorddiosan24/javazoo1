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

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin [Habitat=" + habitat + ", Swimming Depth=" + swimmingDepth + "]";
    }
}
