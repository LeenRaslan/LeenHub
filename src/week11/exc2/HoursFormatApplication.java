package week11.exc2;

public class HoursFormatApplication {

    public static void main(String[] args) {

        HoursFormat format = new HoursFormat();

        String time = "07:05:45PM";
        System.out.println("Input: " + time);
        System.out.println("Output: " + format.toMilitaryTime(time));
    }
}
