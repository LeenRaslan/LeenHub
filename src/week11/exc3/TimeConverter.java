package week11.exc3;

import week11.exc2.HoursFormat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class TimeConverter {


    public void toWords(Integer hour, Integer minutes){

       // HoursFormat hoursFormat = new HoursFormat();
        TimeToWords convert = new TimeToWords();

        LocalTime time = LocalTime.of(hour,minutes);

        //String timeFormat = hoursFormat.toMilitaryTime(String.valueOf(time));
       // DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        //String format = timeFormatter.format(time);
        Integer minute = time.getMinute();
        Integer hours = time.getHour();
        String convertHour = convert.getWord(hours);
        String convertMinutes = convert.getWord(minute);

        if (time.equals(LocalTime.parse("12:00"))) {
            System.out.println("noon");
        }
        if (minute == 0 && !time.equals(LocalTime.parse("12:00"))) {
            System.out.println(convertHour + " o'clock");
        }
        if (minute>1 && minute < 30) {
            System.out.println(convertMinutes + " minutes" + " past " + convertHour);
        }
        if (minute > 30) {
            Integer toMinutes = 60 - minute;
            Integer toHour = hours + 1;
            System.out.println(convert.getWord(toMinutes) + " minutes" + " to " + convert.getWord(toHour));
        }
        if (minute == 30) {
            System.out.println(convertHour + " and a half");
        }
        if (time.isAfter(LocalTime.parse("05:59")) && time.isBefore(LocalTime.parse("11:59"))) {
            System.out.println("in the morning");
        }
        if (time.isAfter(LocalTime.parse("12:00")) && time.isBefore(LocalTime.parse("17:01"))) {
            System.out.println("in the afternoon");
        }
        if (time.isAfter(LocalTime.parse("17:01")) && time.isBefore(LocalTime.parse("20:01"))) {
            System.out.println("in the evening");
        }
        if (time.isAfter(LocalTime.parse("20:00"))) {
            System.out.println("at night");
        }
        if (time.isBefore(LocalTime.parse("06:00"))) {
            System.out.println("at night");
        }
        if (time.equals(LocalTime.parse("00:00"))) {
            System.out.println("at night");
        }


    }
}
