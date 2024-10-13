package tn.esprit.gestionzoo.entities;

public class Aquatique extends Animal{
    protected String habitat ;

    public Aquatique(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatique{" +
                "habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
