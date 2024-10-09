package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount = 0;  // To keep track of number of animals added

    // Constructor
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        int MAX_ANIMALS = 25;
        animals = new Animal[MAX_ANIMALS];
    }
    // Display zoo information
    public void displayZoo() {
        System.out.println("Zoo [Name=" + name + ", City=" + city + ", Number of Cages=" + nbrCages + "]");
    }

    // Add animal to zoo
    public void addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Cannot add animal. The zoo is full.");
            return;
        }
        if (animalCount < nbrCages) {
            animals[animalCount++] = animal;
        }
    }


    // Search for animal by name
    public int searchAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].toString().contains(name)) {
                return i;
            }
        }
        return -1;
    }

    // Remove an animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.toString());
        if (index != -1) {
            // Shift the array elements to fill the removed animal's spot
            System.arraycopy(animals, index + 1, animals, index, animalCount - index - 1);
            animalCount--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Zoo [Name=" + name + ", City=" + city + ", Number of Cages=" + nbrCages + "]";

    }
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Method to compare two zoos and return the one with more animals
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            return null;  // Both have the same number of animals
        }
    }

}
