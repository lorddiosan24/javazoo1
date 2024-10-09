import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Park", "New York", 10);
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.displayZoo();

        // Search for lion
        int lionIndex = myZoo.searchAnimal("Lion");
        System.out.println("Lion found at index: " + lionIndex);

        // Check if the zoo is full
        System.out.println("Is the zoo full? " + myZoo.isZooFull());

        // Comparing two zoos
        Zoo secondZoo = new Zoo("Wildlife Sanctuary", "California", 15);
        secondZoo.addAnimal(new Animal("Canidae", "Wolf", 6, true));

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, secondZoo);
        if (biggerZoo != null) {
            System.out.println("The bigger zoo is: " + biggerZoo);
        } else {
            System.out.println("Both zoos have the same number of animals.");
        }
        Aquatic aquatic = new Aquatic();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        // Display using toString() methods
        System.out.println(aquatic.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());

        // Create instances using parameterized constructors
        Dolphin dolphinParam = new Dolphin("Ocean", 25.5f);
        Penguin penguinParam = new Penguin("Antarctica", 10.2f);

        // Call swim method
        aquatic.swim();
        dolphinParam.swim();
        penguinParam.swim();

        // Display using toString() methods
        System.out.println(dolphinParam.toString());
        System.out.println(penguinParam.toString());
    }

}
