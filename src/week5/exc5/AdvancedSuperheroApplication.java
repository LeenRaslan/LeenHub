package week5.exc5;
import week5.exc4.Superhero;
import week5.exc4.SuperheroCaller;

import java.util.ArrayList;
import java.util.List;

public class AdvancedSuperheroApplication {

    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();
        List<Superhero> superheroes = new ArrayList<>();
        Joker joker = new Joker();

        for (int times = 0; times < 10; times++) {
            Superhero superhero = superheroCaller.call();
            superheroes.add(superhero);
            superhero.fight(joker);

        }
    }
}
