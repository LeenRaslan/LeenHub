package reflection.week11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solstice {

    public void getSummerSolsticeCountdown(Integer Year,Integer Month,Integer Day){
        LocalDate date = LocalDate.of(Year,Month,Day);
        Integer monthValue = date.getMonthValue();
        java.time.Month month = date.getMonth();
        Integer dayOfMonth = date.getDayOfMonth();
        Integer year = date.getYear();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatted = date.format(formatter);

        if (monthValue < 7 && dayOfMonth<22) {
            System.out.println(LocalDate.parse("21.06"));
            //dayOfMonth.equals(21),monthValue.equals(06),year;
        }
        if (date.isLeapYear()){
            System.out.println(dayOfMonth.equals(20));
        }
       // if (date.isBefore(LocalDate.parse(year+" 7 "+" 22 "))) {
        //    System.out.println(date.equals("6"+"21"+year));
        //}
    }

}
