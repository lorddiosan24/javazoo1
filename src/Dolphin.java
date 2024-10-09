public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // Parameterized Constructor
    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Default Constructor
    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin [Habitat=" + habitat + ", Swimming Speed=" + swimmingSpeed + "]";
    }
}

