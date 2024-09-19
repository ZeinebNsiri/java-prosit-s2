import java.util.Arrays;

public class Zoo {
    Animal[] animals ;
    String name;
    String city ;
    int nbCages;

    public Zoo(Animal[] animals, String name, String city, int nbCages) {
        this.animals = new Animal[nbCages];
        this.name = name;
        this.city = city;
        this.nbCages = nbCages;
    }
    void displayZoo(){
        System.out.println("zoo name: "+ name+ ", city name: " + city+ ", number of cages: " + nbCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbCages=" + nbCages +
                '}';
    }
}
