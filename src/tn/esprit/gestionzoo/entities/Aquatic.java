package tn.esprit.gestionzoo.entities;

public  class Aquatic extends Animal implements Carnivore<Food>   {
    private String habitat;
    public Aquatic(){
    }
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat){
        super(family,name,age,isMammal);
        this.habitat =habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println("Aquatic animal is eating meat.");
        } else {
            System.out.println("Aquatic animal cannot eat this type of food.");
        }
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aquatic aquatic = (Aquatic) o;

        if (getAge() != aquatic.getAge()) return false;
        if (!getName().equals(aquatic.getName())) return false;
        return habitat.equals(aquatic.habitat);
    }
    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + habitat.hashCode();
        return result;
    } // It is really important to add the Override the hashCode method ( a best practice for Maps and Sets ).
}
