package tn.esprit.gestionzoo.entities;

public class Terrestre extends Animal implements Omnivore<Food>{
    protected int nbrLegs;



    public Terrestre(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "nbrLegs=" + nbrLegs +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }


    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println(food);
    }

    @Override
    public void eatMeat(Object meat) {
        System.out.println("does work");
    }

    @Override
    public void eatPlant(Object plant) {
        System.out.println("food");
    }
}
