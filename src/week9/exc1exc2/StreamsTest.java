package week9.exc1exc2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import week4.exc9.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamsTest {
    FileReader fileReader = new FileReader();
    Stream<String> names = fileReader.asStream("week9/exc1exc2/names.txt");

    @Test
    void shortNames() {
        List<String> shorted = names
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        List<String> expected = Stream.of("El").collect(Collectors.toList());
        Assertions.assertEquals(expected,shorted);
    }
    @Test
    void bigNames() {
        List<String> mEnding = names
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        List<String> expected = Stream.of("HOSAM","TAMMAM").collect(Collectors.toList());
        Assertions.assertEquals(expected,mEnding);
    }
    @Test
    void contains(){
        List<String> filtered = names
                .filter(e -> e.contains("e") && e.contains("r"))
                .collect(Collectors.toList());
        List<String> expected = Stream.of("Mehran","Norbert","Serife").collect(Collectors.toList());
        Assertions.assertEquals(expected,filtered);
    }
    @Test
    void smallNames() {
        List<String> filtered = names
                .filter(e -> e.length()==4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a") && e.contains("m"))
                .map(e -> e.replace("a","aa"))
                .collect(Collectors.toList());
        List<String> expected = Stream.of("maarj","aamin","omaar").collect(Collectors.toList());
        Assertions.assertEquals(expected,filtered);
    }
}