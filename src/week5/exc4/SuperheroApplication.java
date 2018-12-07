package week5.exc4;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {

    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();
        Superhero callHero = superheroCaller.call();
        System.out.println("Superhero: " + callHero);

        //int size = superheroes.size();
        List<Superhero> superheroes = new ArrayList<>();

        System.out.println(superheroes);

        for (int i= 1; i < 7; i++) {

        Superhero superhero = superheroCaller.call();
        superheroes.add(superhero);
        System.out.println("Superhero " + i + ":" + superhero);
        }

        int size = superheroes.size();
        System.out.println("Number of superheroes: " + size);

    }
}
