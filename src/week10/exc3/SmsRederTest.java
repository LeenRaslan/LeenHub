package week10.exc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SmsRederTest {

    private SmsReader reader = new SmsReader();
    private List<Sms> sms = reader.getSms();

    @Test
    void getSmsPercentage() {
        String result = sms.stream()
                .collect(Collectors.groupingBy(Sms::getLabel, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + (e.getValue() * 100) / sms.size() + "%")
                .collect(Collectors.joining(" "));
        String expected = "ham 86% spam 13%";
        Assertions.assertEquals(expected, result);
    }
    @Test
    void getMostUsedWordInHam(){
        String result = sms.stream()
                .filter(e-> e.getLabel().contains("ham"))
                .map(e-> e.getText().split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Most used ham word: " +e.getKey()+ " appears " + e.getValue() + " times")
                .limit(1)
                .collect(Collectors.joining(" "));
        String expected = "Most used ham word: to appears 1531 times";
        Assertions.assertEquals(expected,result);
    }
    @Test
    void getMostUsedLetterInHam(){
        String result = sms.stream()
                .filter(e-> e.getLabel().contains("ham"))
                .map(e-> e.getText().split(" "))
                .flatMap(Stream::of)
                .map(e->e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Most used ham letter: " +e.getKey()+ " appears " + e.getValue() + " times")
                .limit(1)
                .collect(Collectors.joining(" "));
        String expected = "Most used ham letter: e appears 26364 times";
        Assertions.assertEquals(expected,result);
    }

    @Test
    void getLongestSpamMsg(){
        String result = sms.stream()
                .filter(e-> e.getLabel().equals("spam"))
                .map(Sms::getText)
                .map(String::length)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .limit(1)
                .map(e-> "Longest spam message: " + e)
                .collect(Collectors.joining(" "));
        String expected = "Longest spam message: 224";
        Assertions.assertEquals(expected,result);
    }

}