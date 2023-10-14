package tn.esprit.gestionzoo.entities;

public  class Animal  {
    private String family;
    String name;
    private int age;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age Cannot be negative");
        }
        this.isMammal = isMammal;
    }
    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    private boolean isMammal;

    public void displayAnimal(){
        System.out.println("Nom du famille : " + family);
        System.out.println("Nom d'animal : " + name);
        System.out.println("Age d'animal: " + age);
        System.out.println("Mammal :" + isMammal);
    }
    @Override
    public String toString() {
        return "Nom du famille : " + family + "\nNom d'animal : " + name+ "\nAge d'animal: " + age +"\nMammal :" + isMammal;
    }
}
