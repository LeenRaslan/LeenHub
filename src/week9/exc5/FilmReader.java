package week9.exc5;

import week4.exc9.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    public List<Film> getFilms(){
        return new FileReader().asStream(" week9/exc5/films.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Film(e[8], Double.valueOf(e[9]), Integer.valueOf(e[10]),
                        Integer.valueOf(e[6]), Integer.valueOf(e[0]), Integer.valueOf(e[5])))
               // .sorted(Comparator.comparing(Film::getScore))
                //.limit(10)
                .collect(Collectors.toList());
                //.forEach(e-> System.out.println(e.getTitle() + e.getScore() + e.getVoteCount() + e.getRuntime() + e.getBudget() + e.getRevenue()));

    }
}
