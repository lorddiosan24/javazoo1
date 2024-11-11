package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        // Create a Zoo with a capacity of 10 animals
        Zoo myZoo = new Zoo("Safari Park", "New York", 10);

        // Add some animals to the zoo
        try {
            myZoo.addAnimal(new Animal("Felidae", "Lion", 5, true));
            myZoo.addAnimal(new Animal("Felidae", "Tiger", 4, true));
            myZoo.addAnimal(new Animal("Canidae", "Wolf", 1, true));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Error while adding an animal: " + e.getMessage());
        }

        // Display zoo details
        myZoo.displayZoo();

        // Search for the lion by name
        int lionIndex = myZoo.searchAnimal("Lion");
        if (lionIndex != -1) {
            System.out.println("Lion found at index: " + lionIndex);
        } else {
            System.out.println("Lion not found in the zoo.");
        }

        // Check if the zoo is full
        System.out.println("Is the zoo full? " + myZoo.isZooFull());

        // Comparing myZoo with another zoo
        Zoo secondZoo = new Zoo("Wildlife Sanctuary", "California", 15);
        try {
            secondZoo.addAnimal(new Animal("Canidae", "Wolf", 6, true));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Error while adding an animal to second zoo: " + e.getMessage());
        }

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, secondZoo);
        if (biggerZoo != null) {
            System.out.println("The bigger zoo is: " + biggerZoo);
        } else {
            System.out.println("Both zoos have the same number of animals.");
        }

        // Create and add some aquatic animals
        Dolphin dolphin = new Dolphin("Ocean", 25.5f);
        Penguin penguin = new Penguin("Antarctica", 10.2f);

        // Adding aquatic animals to myZoo
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        // Display swimming behavior of all aquatic animals
        myZoo.swimAll();

        // Display information about dolphin and penguin using toString()
        System.out.println(dolphin);
        System.out.println(penguin);

        // Display the maximum swimming depth of penguins in the zoo
        System.out.println("Max penguin swimming depth: " + myZoo.maxPenguinSwimmingDepth());

        // Display number of dolphins and penguins in the zoo
        myZoo.displayNumberOfAquaticsByType();
    }
}
