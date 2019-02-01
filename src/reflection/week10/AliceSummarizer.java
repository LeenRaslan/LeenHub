package reflection.week10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceSummarizer {
    List<String> words = new AliceReader().getWords();

    public long getNumberOfWords() {
        return words.stream()
                .count();
    }
    public long getNumberOfDistinctWords(){
        return words.stream()
                .distinct()
                .count();
    }
    public String getLongestWord(){
        return words.stream()
                .collect(Collectors.groupingBy(e-> e.length(), Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .map(e -> "Longest words: "+ e.getKey() + " | " + e.getValue())
                .limit(1)
                .collect(Collectors.joining(" "));
    }
    public String getMostRepeated(){
        return words.stream()
                .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " appears " + e.getValue() + " times")
                .limit(5)
                .collect(Collectors.joining(" "));
    }
    public String getMostRepeatedLetters(){
        return words.stream()
                .map(e-> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " appears " + e.getValue() + " times")
                .limit(5)
                .collect(Collectors.joining(" "));
    }
    public long getNumberOfAliceRepetition(){
        return words.stream()
                .filter(e-> e.equalsIgnoreCase("Alice"))
                .count();
//                .flatMap(Stream::of)
//                .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
//                .entrySet().stream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//                .map(e -> e.getKey() + " appears " + e.getValue() + " times")
//                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        AliceSummarizer summarizer = new AliceSummarizer();
        AliceReader reader = new AliceReader();
        System.out.println(reader.getWords());
        System.out.println(summarizer.getNumberOfWords());
        System.out.println(summarizer.getNumberOfDistinctWords());
        System.out.println(summarizer.getLongestWord());
        System.out.println(summarizer.getMostRepeated());
        System.out.println(summarizer.getMostRepeatedLetters());
        System.out.println("Alice repetitions: " + summarizer.getNumberOfAliceRepetition());

    }
}