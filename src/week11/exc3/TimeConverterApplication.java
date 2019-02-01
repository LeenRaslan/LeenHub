package week11.exc3;

import week11.exc2.HoursFormat;

public class TimeConverterApplication {
    public static void main(String[] args) {

        TimeConverter converter = new TimeConverter();
        HoursFormat hoursFormat = new HoursFormat();
        //converter.toWords(21,30));
        converter.toWords(5,47);
        converter.toWords(3,00);
        converter.toWords(6,50);
        converter.toWords(12,00);
    }
}
