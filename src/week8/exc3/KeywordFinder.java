package week8.exc3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> finder(List<String> words, Predicate<String> condition) {
        List<String> found = new ArrayList<>();
        for (String word : words) {
            if (condition.test(word)) {
                found.add(word);
            }
        }
        return found;
    }

    public List<String> findElegant(String sentence){
        String[] splitted = sentence.split(" ");
        List<String> words = Arrays.asList(splitted);
        return finder(words , e -> e.startsWith("ele"));
    }

    public List<String> findPlayful(String sentence){
        String[] splited = sentence.split(" ");
        List<String> words = Arrays.asList(splited);
        return finder(words , e -> e.endsWith("ful"));
    }
}
