package week9.exc3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {
    private List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

    public String cipher(String plaintext, int key) {
        return Stream.of(plaintext.split("")).map(letter -> encrypt(letter, key)).collect(Collectors.joining());
    }

    public String encrypt(String letter, int key) {

        if (!alphabet.contains(letter.toLowerCase())) {
            return letter;
        }
        int position = alphabet.indexOf(letter.toLowerCase());
        int shift = (position + key) % alphabet.size();
        String encryptedLetter = alphabet.get(shift);
        if (Character.isUpperCase(letter.charAt(0))) {
            return encryptedLetter.toUpperCase();
        }
        return encryptedLetter;
    }
}