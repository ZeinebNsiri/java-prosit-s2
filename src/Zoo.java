import java.util.Arrays;

public class Zoo {
    Animal[] animals ;
    String name;
    String city ;
    final static int nbCages=25;

    public Zoo(Animal[] animals, String name, String city) {
        this.animals = new Animal[nbCages];
        this.name = name;
        this.city = city;
        //this.nbCages = nbCages;
    }
    void displayZoo(){
        System.out.println("zoo name: "+ name+ ", city name: " + city+ ", number of cages: " + nbCages);
    }

    void showAnimals(){
        for (int i = 0; i < animals.length; i++) {
            if ( animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbCages=" + nbCages +
                '}';
    }

    public boolean addAnimal(Animal animal){
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animal.name.equals(animals[i].name)) {
                return false;
            }
            else if (animals[i] == null ) {
                animals[i] = animal;
                return true;

            }
        }
        return false;
    }



    public int searchAnimal(Animal animal){
        for (int i = 0; i < animals.length; i++){
          if (animals[i]== animal && animals[i].name == animal.name ){
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
