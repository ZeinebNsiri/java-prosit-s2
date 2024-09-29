import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {

        Animal animals[] = new Animal[25];
        Animal lion= new Animal("carnivor", "simba", 2, true);
        animals[0]= lion;
        Animal tiger= new Animal("carnivor", "death", 3, true);
        animals[1]= tiger;
        Animal eagle= new Animal("carnivor", "kartal", 1, true);
        animals[2]= eagle;
        Animal lion2= new Animal("carnivor", "simba", 2, true);
        animals[3]= lion2;

        Zoo myZoo= new Zoo(animals, "jurassicWorld", "tunis" );
        Zoo myZoo2= new Zoo(animals, "jurassicWorld2", "tunis2" );



        boolean test01 = myZoo.addAnimal(lion);
        System.out.println(test01);
        boolean test02 = myZoo.addAnimal(lion2);
        System.out.println(test02);

        myZoo.addAnimal(tiger);
        myZoo.addAnimal(eagle);

        //myZoo.removeAnimal(tiger);

        myZoo.showAnimals();

        int test1 = myZoo.searchAnimal(lion);
        System.out.println(test1);
        int test2 = myZoo.searchAnimal(lion2);
        System.out.println(test2);

        myZoo.removeAnimal(tiger);
        myZoo.showAnimals();

        int test3 = myZoo.searchAnimal(lion);
        System.out.println(test3);
        int test4 = myZoo.searchAnimal(eagle);
        System.out.println(test4);

        boolean instruction14 = myZoo.isZooFull();
        System.out.println(instruction14);

        System.out.println("instruction 16");
        Animal dragon= new Animal("carnivor", "toothless", 600, true);
        animals[0]= dragon;
        boolean test5 = myZoo2.addAnimal(dragon);
        System.out.println(test5);
        myZoo2.showAnimals();

        Zoo bigger = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println(bigger);




//        myZoo.displayZoo();
//        System.out.println(myZoo);
//        System.out.println(myZoo.toString());


//       lion.displayAnimals();
//       System.out.println(lion);
//       System.out.println(lion.toString());


    }
}
