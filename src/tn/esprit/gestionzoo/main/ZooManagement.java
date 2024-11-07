package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        Animal animals[] = new Animal[3];
        Animal lion= new Animal("carnivor", "simba", 2, true);

        Animal tiger= new Animal("carnivor", "death", 3, true);

        Animal eagle= new Animal("carnivor", "kartal", -6, true);

        Animal lion2= new Animal("carnivor", "simba", 2, true);

        Animal dragon= new Animal("carnivor", "toothless", 600, true);
        animals[0]= dragon;

        Zoo myZoo= new Zoo(animals, "jurassicWorld", "tunis" );
        Zoo myZoo2= new Zoo(animals, "jurassicWorld2", "tunis2" );


            try {
                myZoo.addAnimal(lion);

                myZoo.addAnimal(lion2);

                myZoo2.addAnimal(dragon);

                myZoo.addAnimal(tiger);
                myZoo.addAnimal(eagle);
            } catch (ZooFullException e) {
                System.out.println(e.getMessage());
            }
            catch (InvalidAgeException i) {
                System.out.println(i.getMessage());
            }



        //myZoo.removeAnimal(tiger);

        myZoo.showAnimals();

        int test1 = myZoo.searchAnimal(lion);
        System.out.println(test1);
//        int test2 = myZoo.searchAnimal(lion2);
//        System.out.println(test2);

        myZoo.removeAnimal(tiger);
        myZoo.showAnimals();

        int test3 = myZoo.searchAnimal(lion);
        System.out.println(test3);
        int test4 = myZoo.searchAnimal(eagle);
        System.out.println(test4);

        boolean instruction14 = myZoo.isZooFull();
        System.out.println(instruction14);

        System.out.println("instruction 16");


        myZoo2.showAnimals();

        Zoo bigger = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println(bigger);

   //     Aquatique wale= new Aquatique("carnivor", "walii", 2, true, "oceon");
//        Aquatique wale2= new Aquatique("carnivor", "walii2", 2, true, "oceon");
//        Aquatique wale3= new Aquatique("carnivor", "walii3", 2, true, "oceon");
        Terrestre rabbit= new Terrestre("carnivor", "rabbi", 2, true, 4);
        Dolphin dof1= new Dolphin("carnivor", "dofii", 2, true, "oceon",600);
        Penguin pen1= new Penguin("carnivor", "pene", 2, true, "oceon",400);
        Penguin pen2= new Penguin("carnivor", "pene", 2, true, "oceon",300);

       // System.out.println(wale.toString());
        System.out.println(rabbit.toString());
        System.out.println(dof1.toString());
        System.out.println(pen1.toString());


       // wale.swim();
        dof1.swim(); //il a utilisé sa fonction swim pas de l'heritage de aquatique
        pen1.swim();

        myZoo.addAquaticAnimal(dof1);
        myZoo.addAquaticAnimal(pen1);
        myZoo.addAquaticAnimal(pen2);

        System.out.println(myZoo.toString());
        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        boolean res = dof1.equals(pen2);
        System.out.println(res);


        dof1.eatMeat(Food.MEAT);
        pen1.eatMeat(Food.MEAT);
        rabbit.eatPlantAndMeet(Food.MEAT);
        rabbit.eatPlant(Food.MEAT);
        rabbit.eatMeat(Food.MEAT);


//       Aquatique wale = new Aquatique();
//        Terrestre rabbit = new Terrestre();
//        Dolphin dof1 = new Dolphin();
//        Penguin pen1 = new Penguin();


//        myZoo.displayZoo();
//        System.out.println(myZoo);
//        System.out.println(myZoo.toString());


//       lion.displayAnimals();
//       System.out.println(lion);
//       System.out.println(lion.toString());


    }
}
