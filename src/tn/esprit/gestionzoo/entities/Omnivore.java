package tn.esprit.gestionzoo.entities;

public interface Omnivore <T> extends Carnivore,Herbivore {
    void eatPlantAndMeet(T food);
}
