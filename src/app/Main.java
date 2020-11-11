package app;

import animals.Animal;
import animals.Cat;
import animals.Hamster;
import animals.Tarantula;
import kati.Kati;
import kati.Mood;

public class Main {
    public static void main(String[] args) {
        Kati kati = new Kati();
        Animal animal1 = new Tarantula("Joe", 15);
        Animal animal2 = new Tarantula("Kim", 20);
        Animal animal3 = new Cat("Sofia", 10);
        Animal animal4 = new Cat("Adam", 30);
        Animal animal5 = new Hamster("Fish", 14);
        Animal animal6 = new Hamster("Rainbow", 40);
        kati.buyAnimal(animal1);
        kati.buyAnimal(animal2);
        kati.buyAnimal(animal3);
        kati.buyAnimal(animal4);
        kati.buyAnimal(animal5);
        kati.buyAnimal(animal6);

        for (int i = 1; i < 10; i++) {
            kati.setMood(Mood.HAPPY);
            kati.careAnimal(kati.getMood());
            kati.writeNote(kati.getMood());
            System.out.println("");
            kati.setMood(Mood.NORMAL);
            kati.careAnimal(kati.getMood());
            kati.writeNote(kati.getMood());
            System.out.println("");
            kati.setMood(Mood.BAD);
            kati.careAnimal(kati.getMood());
            kati.writeNote(kati.getMood());
            System.out.println("");
        }

    }
}
