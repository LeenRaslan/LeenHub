package week11.exc2;

import java.time.format.DateTimeFormatter;

public class HoursFormat {

    private DateTimeFormatter format12 = DateTimeFormatter.ofPattern("hh:mm:ssa");
    private DateTimeFormatter format24 = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String toMilitaryTime(String time){
        return format24.format(format12.parse(time));
    }

}
