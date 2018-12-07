package week5.exc4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {
    private Random random = new Random();

    Superhero batman = new Batman();
    Superhero superman = new Superman();
    Superhero spiderman = new Spiderman();
    List<Superhero> superheroes = Arrays.asList(batman,superman,spiderman);


    public Superhero call() {
        int position = random.nextInt(3);
        Superhero hero = superheroes.get(position);
        return hero;
    }


    public List<Superhero> getSuperheroes() {
        return superheroes;
    }

}
