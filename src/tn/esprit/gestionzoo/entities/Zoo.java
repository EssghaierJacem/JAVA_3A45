package tn.esprit.gestionzoo.entities;

public class Zoo {
    private  int nbrCages;
    private Animal[] animals;
    private String name;
    private String city;
    private static final int MAX_ANIMALS = 25;
    private int compteur_animal;


    public Zoo(String name, String city, int nbrCages) {
        if (nbrCages > MAX_ANIMALS) {
            throw new IllegalArgumentException("The number of cages cannot exceed " + MAX_ANIMALS);
        }

        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.compteur_animal = 0;
    }
    public void displayZoo(){
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < compteur_animal; i++) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + (i + 1) + ": " + animals[i].name);
        }

    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < compteur_animal; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("The tn.esprit.gestionzoo.entities.Zoo can't be empty!");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCompteur_animal() {
        return compteur_animal;
    }

    public void setCompteur_animal(int compteur_animal) {
        this.compteur_animal = compteur_animal;
    }

    public boolean addAnimal(Animal animal){
        if (isZooFull()){
            System.out.println("This tn.esprit.gestionzoo.entities.Zoo is Full, it is impossible to add another animal!"); //Instruction 17: Condition d'ajout
            return false;
        } else {
        }
        if (compteur_animal < nbrCages){
            animals[compteur_animal] = animal;
            compteur_animal++;
            return true;}
            {
                return false;
            }

        }

    public boolean  addAnimal2 (Animal animal){
        for (int i = 0; i < compteur_animal; i++) {
            if (animals[i].name.equals(animal.name)) {
                return false;
            }
        }
        if (compteur_animal < MAX_ANIMALS) {
            animals[compteur_animal] = animal;
            compteur_animal++;
            return true;
        }
        {
            return false;
        }
    }
    //Instruction 13 : Remove an animal
    public boolean removeAnimal(Animal animal) {
        int animalIndex = findAnimalIndex(animal);
        if (animalIndex != -1) {
            for (int i = animalIndex; i < compteur_animal - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[compteur_animal - 1] = null;
            compteur_animal--;
            return true;}
        {
            return false;
        }
    }

    private int findAnimalIndex(Animal animal) {
        for (int i = 0; i < compteur_animal; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    //
    public boolean isZooFull() {
        return compteur_animal == nbrCages;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.compteur_animal > z2.compteur_animal)
            return z1;
        return z2;
    }
    @Override
    public String toString() {
        return "Nom du zoo : " + name + "\nVille du zoo : " + city + "\nNombre de cages : " + nbrCages;
    }
}