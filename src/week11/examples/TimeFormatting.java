package week11.examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TimeFormatting {

    public static void main(String[] args) {
        System.out.println("---TIME FORMATTING");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now in standard formatting: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH|mm|ss");
        String formatted = now.format(formatter);
        System.out.println("Now formatted: " + formatted);
    }
}
