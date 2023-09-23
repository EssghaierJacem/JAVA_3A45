public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
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
