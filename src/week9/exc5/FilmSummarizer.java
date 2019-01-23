package week9.exc5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {

    FilmReader reader = new FilmReader();

    public List<Film> getTop3Rated() {
        return reader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getTop3RatedLongerThan3Hours() {
        return reader.getFilms().stream()
                .filter(e -> e.getRuntime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getTop4MostExpensive() {
        return reader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Film> getTop4MostExpensiveShorterThan90Minutes() {
        return reader.getFilms().stream()
                .filter(e -> e.getRuntime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Film> getTop4RatedLowBudget() {
        return reader.getFilms().stream()
                .filter(e -> e.getScore() > 7)
                .filter(e -> e.getBudget() > 50000)
                .filter(e -> e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }
}

