package week9.exc4;
import week4.exc9.FileReader;
import week9.exc4.HappinessRecord;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HappinessApplication {

    public static void main(String[] args) {
        new FileReader().asStream("week9/exc4/world-happiness-2017.csv")
                .skip(1)
                .map(e-> e.split(";"))
                .map(e-> new HappinessRecord(e[0], Integer.valueOf(e[1]),Double.valueOf(e[2])))
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .forEach(e -> System.out.println("Rank: " + e.getRank() + " | Country: " + e.getCountry() + " | Score: " + e.getScore()));

    }
}