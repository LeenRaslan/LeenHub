package week9.exc4;
import week4.exc9.FileReader;

import java.util.stream.Stream;

public class HappinessRecord {

    public String country;
    public Integer rank;
    public Double score;

    public HappinessRecord(String country, Integer rank, Double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    public String getCountry() {
        return country;
    }
    public Integer getRank() {
        return rank;
    }
    public Double getScore() {
        return score;
    }

}
