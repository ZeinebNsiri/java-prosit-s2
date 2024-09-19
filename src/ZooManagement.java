import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {

        Animal animals[] = new Animal[25];
        Animal lion= new Animal("carnivor", "simba", 2, true);
        animals[0]= lion;
        Zoo myZoo= new Zoo(animals, "jurassicWorld", "tunis", 20 );

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        lion.displayAnimals();
        System.out.println(lion);
        System.out.println(lion.toString());




    }
}
