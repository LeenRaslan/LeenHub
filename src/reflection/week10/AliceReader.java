package reflection.week10;

import week4.exc9.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceReader {

    FileReader reader = new FileReader();

    public List<String> getWords() {
        return reader.asStream("reflection/week10/alice.txt")
                .map(String::toLowerCase)
                .map(e -> e.replaceAll(",", " "))
                .map(e -> e.replaceAll(";", " "))
                .map(e -> e.replaceAll("’s", " "))
                .map(e -> e.replaceAll("’", " "))
                .map(e -> e.replaceAll("‘", " "))
                .map(e -> e.replaceAll(":", " "))
                .map(e -> e.replaceAll("#", " "))
                .map(e -> e.replaceAll("/", " "))
                .map(e -> e.replaceAll("-", " "))
                .map(e -> e.replaceAll("\\.", " "))
                .map(e -> e.replaceAll("\\*", " "))
                .map(e -> e.replaceAll("\\(", " "))
                .map(e -> e.replaceAll("\\)", " "))
                .map(e -> e.replaceAll("\\[", " "))
                .map(e -> e.replaceAll("\\]", " "))
                .map(e -> e.replaceAll("“", " "))
                .map(e -> e.replaceAll("”", " "))
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());

    }
}