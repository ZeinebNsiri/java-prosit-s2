package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public int getAge() {
        return age;
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
        if (age<0){
                System.out.println("age doit etre un nombre positif");
             }
        else {
            this.age = age;
        }
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    void displayAnimals(){
        System.out.println("family name: "+ family +", name: "+ name+ ", city name: " + age+ ", number of cages: " + isMammal);
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
