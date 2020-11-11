package kati;

import animals.Animal;
import animals.Cat;
import animals.Hamster;
import animals.Tarantula;

import java.util.*;

public class Kati {
    List<Animal> animals = new ArrayList<Animal>();
    Mood mood;

    public void buyAnimal(Animal animal) {
        animals.add(animal);
    }

    public void writeNote(Mood mood){
        System.out.println("Number of animals: " + animals.size());
        for (Animal animal : animals) {
            System.out.println(animal + mood.toString());
        }


    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Mood getMood() {
        return mood;
    }

    public void careAnimal(Mood mood) {
        Iterator<Animal> iter = animals.iterator();
        while (iter.hasNext()) {
            Animal animal = iter.next();
            if (!animal.isAnimalDead()) {
                if (animal.getClass().equals(Tarantula.class)) {
                    animal.setLifePoint(mood.getTlife());
                } else if (animal.getClass().equals(Hamster.class)) {
                    animal.setLifePoint(mood.getHlife());
                } else if (animal.getClass().equals(Cat.class)){
                    animal.setLifePoint(mood.getClife());
                }
                if(animal.isAnimalDead()){
                    iter.remove();
                }
                animal.setMaxHealth();
            } else {
                iter.remove();
            }
        }
    }
}
