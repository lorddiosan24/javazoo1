package tn.esprit.gestionzoo.entities;
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructor
    public Animal(String family, String name, int age, boolean isMammal) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


