package tn.esprit.gestionzoo.main;

import java.util.Scanner;

public class ZooManagement {
    private int nbrCages = 20;
    private String zooName = "my zoo";

    // Constructor to initialize variables
    public ZooManagement() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }

    // Method to allow user input for zoo name and number of cages
    public void setupZoo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the zoo: ");
        zooName = sc.nextLine();

        System.out.print("Enter the number of cages: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number of cages.");
            sc.next();  // Clears invalid input
        }
        nbrCages = sc.nextInt();

        System.out.println(zooName + " comporte " + nbrCages + " cages");
        sc.close();
    }

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        zoo.setupZoo();  // Setup zoo with user input
    }
}
