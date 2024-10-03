package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals ;
    private String name;
    private String city ;
    private final static int nbCages=25;

    public Zoo(Animal[] animals, String name, String city) {
        this.animals = new Animal[nbCages];
        this.name = name;
        this.city = city;
        //this.nbCages = nbCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        if (name == null ) {
            System.out.println("Name is empty");
        } else{
        this.name = name;}
    }

    public void setCity(String city) {
        this.city = city;
    }

    void displayZoo(){
        System.out.println("zoo name: "+ name+ ", city name: " + city+ ", number of cages: " + nbCages);
    }

    public void showAnimals(){
        for (int i = 0; i < animals.length; i++) {
            if ( animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbCages=" + nbCages +
                '}';
    }

    public boolean addAnimal(Animal animal){
        if (isZooFull() ){
            return false;
        }
        else {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] != null && animal.getName().equals(animals[i].getName())) {
                    return false;
                } else if (animals[i] == null) {
                    animals[i] = animal;
                    return true;

                }
            }
        }
        return false;
    }



    public int searchAnimal(Animal animal){
        for (int i = 0; i < animals.length; i++){
          if (animals[i]== animal && animals[i].getName() == animal.getName() ){
                return i;
          }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        for (int i = 0; i < animals.length; i++){
            if (animals[i] == animal ){
                animals[i] = null;
                System.out.println("animal removed");
                for (int j = i ; j < animals.length -1; j++) {
                    animals[j] = animals[j+1];
                }
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull(){
        int totalAnimal = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                totalAnimal = totalAnimal + 1;
            }
        }
        return  (totalAnimal == nbCages);

    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        int totalAnimal1 = 0;
        int totalAnimal2 = 0;
        for (int i = 0; i < Zoo.nbCages; i++) {
            if (z1.animals[i] != null) {
                totalAnimal1 = totalAnimal1 + 1;
            }
            if (z2.animals[i] != null) {
                totalAnimal2 = totalAnimal2 + 1;
            }

        } if (totalAnimal1 > totalAnimal2) {
            return z1;
        } else {
            return z2;
        }

    }



}
