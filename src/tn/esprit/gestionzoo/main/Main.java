package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Animal Lion = new Animal("Carnivore","Lion",21, true);
        Animal Elephant = new Animal("Elephant", "Herbivore", 4,false);

        Zoo Oorbata = new Zoo("Oorbata","Gafsa",23);

        //Instruction 6 : Au premier lieu il n'y avait pas d'un constructeur paramétres,
        // alors, il n'était pas possible de créer des instanciations.

        Oorbata.displayZoo(); // Affiche les informations du tn.esprit.gestionzoo.entities.Zoo "Oorbata"

        /* System.out.println(Oorbata); Affiche la réference du tn.esprit.gestionzoo.entities.Zoo "Oorbata" (Instruction8)
        System.out.println(Oorbata.toString());
        (Instruction9) J'ai modifié la méthode toString et ajouté @Override, pour qu'elle prends la place de la méthode originale,
        ce qui permet d'avoir le meme role que "DisplayZoo"
        */


        Lion.displayAnimal();
        //System.out.print(Lion.toString());

        System.out.println("Ajout de l'éléphant : " + Oorbata.addAnimal(Elephant));

        //Instruction 11
        Zoo ZooTest = new Zoo("ZooTest", "London", 10);
        Animal Dog = new Animal("Dog", "Carnivore", 4,true);
        //ZooTest.addAnimal(Dog);
        int DogIndex = ZooTest.searchAnimal(Dog);
        System.out.println("Indice du Dog1 dans le zoo : " + DogIndex);


        Animal Dog2 = new Animal("Dog", "Carnivore", 4,true);
        //ZooTest.addAnimal(Dog2);
        int Dog2Index = ZooTest.searchAnimal(Dog2);
        System.out.println("Indice du Dog2 dans le zoo : " + Dog2Index);

        //La méthode de recherche se base sur le nom de l'animal pour trouver
        //une correspondance et renvoie l'indice du premier animal avec le même nom trouvé dans le zoo.

        //Instruction 12
        boolean addedDog1 = ZooTest.addAnimal2(Dog);
        boolean addedDog2 = ZooTest.addAnimal2(Dog2);
        System.out.println("Ajout du Dog : " + addedDog1);
        System.out.println("Ajout du Dog2 : " + addedDog2);

        boolean zooIsFull = Oorbata.isZooFull();{
        if (zooIsFull) {
            System.out.println("The zoo is full.");
        } else {
            System.out.println("There is still room in the zoo.");
        }
    }
        // Héritage_Prosit 5
        Aquatic Aquatic1 = new Aquatic("Octopus", "Oscar", 3, true, "Deep Sea");
        Terrestrial Terrestrial1 = new Terrestrial("Giraffe", "Stretch", 8, true, 4);
        Dolphin Dolphin1 = new Dolphin("Delphinidae", "Bubbles", 9, true, "Ocean", 13.1f);
        Penguin Penguin1 = new Penguin("Spheniscidae", "Chirp", 1, true, "Ocean", 19.5f);

        System.out.println("Details about the Aquatic1:");
        System.out.println(Aquatic1.toString());

        System.out.println("Details about the Dolpin1 :");
        System.out.println(Dolphin1.toString());

        System.out.println("Details about the Penguin:");
        System.out.println(Penguin1.toString());

        System.out.println("----------------");
        Aquatic1.swim();
        Dolphin1.swim();
        Penguin1.swim();
        // The Dolphin has their own redfined method, so it's results differs than the one Penguin automatically Inherited.
    }
}