public class Terrestrial {
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
        return "Terrestrial [Number of Legs=" + nbrLegs + "]";
    }
}
