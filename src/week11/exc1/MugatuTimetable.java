package week11.exc1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalTime;

public class MugatuTimetable {

    public static void main(String[] args) {
        LocalDate day = LocalDate.parse("2003-03-13");
        LocalTime time = LocalTime.parse("10:00:00");
        LocalDateTime start = LocalDateTime.of(day, time);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(start.format(timeFormatter));
        System.out.println(start.getDayOfWeek());

        LocalDateTime pickedUpTime = start.plusMinutes(37).plusSeconds(21);

        System.out.println(pickedUpTime.toLocalTime());

        LocalDateTime arriveToAirport = pickedUpTime.plusMinutes(90);
        System.out.println(arriveToAirport.toLocalTime());

        LocalDateTime flightTime = LocalDateTime.of(2003, 03, 13, 11, 04, 00);
        System.out.println(arriveToAirport.isAfter(flightTime));


        LocalTime nextFlight = LocalTime.of(18, 45, 00);
        LocalDateTime nextFlightDate = LocalDateTime.of(day, nextFlight);
        Duration duration = Duration.between(arriveToAirport.toLocalTime(), nextFlight);
        System.out.println(duration.toHours() + ":" + duration.minusHours(duration.toHours()).toMinutes());

        LocalDateTime timeInLondon = nextFlightDate.plusMinutes(50).plusHours(11);
        System.out.println(timeInLondon.toLocalTime());
        ZoneId london = ZoneId.of("Europe/London");

        ZonedDateTime inLondon = timeInLondon.atZone(london);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime nowInTokyo = inLondon.withZoneSameInstant(tokyo);
        System.out.println(nowInTokyo);


        LocalDateTime wakingUpTime = nowInTokyo.toLocalDateTime().plusHours(11);
        System.out.println(wakingUpTime.format(timeFormatter));

        LocalDateTime shooting = wakingUpTime.plusMinutes(47);
        System.out.println(shooting.toLocalTime());

        Duration preparedTimeInLimousine = Duration.ofMinutes(47).minusSeconds(546);
        System.out.println(preparedTimeInLimousine);

        LocalDateTime afterShooting = shooting.plusHours(7);
        LocalTime dinner = LocalTime.of(20, 00, 00);
        Duration betweenAfterShootingAndDinner = Duration.between(afterShooting.toLocalTime(), dinner);
        if (betweenAfterShootingAndDinner.isNegative() || betweenAfterShootingAndDinner.isZero()) {
            System.out.println("he should have lunch");
        } else {
            System.out.println("he should have dinner");
        }

        LocalDateTime flightBack = afterShooting.plusDays(3).plusHours(12);
        LocalDateTime backInLondon = flightBack.plusHours(11).plusMinutes(50);
        System.out.println("time in Tokyo: " + backInLondon);

        ZonedDateTime inTokyo = backInLondon.atZone(tokyo);
        ZonedDateTime nowInLondon = inTokyo.withZoneSameInstant(london);
        System.out.println("time in london: " + nowInLondon);


        LocalDateTime withFans = nowInLondon.plusSeconds(12 * 173).toLocalDateTime();
        Duration timeWithFans = Duration.between(nowInLondon.toLocalDateTime(), withFans);
        System.out.println(timeWithFans);

        LocalDateTime arriveToHotel = withFans.plusHours(1);
        System.out.println(arriveToHotel);
        System.out.println(arriveToHotel.getDayOfWeek());
        LocalTime souna1 = LocalTime.of(9, 00, 00);
        LocalTime souna2 = LocalTime.of(14, 00, 00);
        LocalTime souna3 = LocalTime.of(16, 00, 00);
        LocalTime souna4 = LocalTime.of(20, 00, 00);
        if (isIncludedInFirstOption(arriveToHotel, souna1, souna2) || isIncludedInFirstOption(arriveToHotel, souna3, souna4)) {
            System.out.println("he can go to the souna");
        } else {
            System.out.println("he cant go to the souna");
        }


        if (isMassageDay(arriveToHotel)) {
            System.out.println("he can enjoy a massage");

        } else if (arriveToHotel.toLocalDate().isLeapYear() && arriveToHotel.getDayOfWeek().equals("SATURDAY")) {
            System.out.println("he can enjoy a massage");

        } else {
            System.out.println("he cant enjoy a massage");
        }

        ZonedDateTime hotelInLondon = arriveToHotel.atZone(london);

        ZonedDateTime hotelInTokyo = hotelInLondon.withZoneSameInstant(tokyo);

        LocalDate afterOneWeek = hotelInTokyo.toLocalDate().plusWeeks(1);
        LocalTime afterOneWeekTime = LocalTime.of(18, 30, 00);
        LocalDateTime TvTimeInTokyo = LocalDateTime.of(afterOneWeek, afterOneWeekTime);

        ZonedDateTime tvInTokyo = TvTimeInTokyo.atZone(tokyo);
        ZonedDateTime tvTimeInLondon = tvInTokyo.withZoneSameInstant(london);
        LocalDateTime tvTime = tvTimeInLondon.toLocalDateTime();
        System.out.println(tvTime.toLocalTime());

        LocalDateTime congratulationCall = tvTime.plusSeconds(29).plusSeconds(15);
        System.out.println(congratulationCall.toLocalTime());
        System.out.println(congratulationCall.getDayOfWeek());

        //Period totalPeriod = Period.between(start.toLocalDate(), congratulationCall.toLocalDate());
        //System.out.println(totalPeriod.getDays());
        //int relativeDays = totalPeriod.getDays();
        //Duration totalDuration = Duration.between(start.toLocalTime(), congratulationCall.toLocalTime());
        //long relativeMinutes = totalDuration.minusSeconds(546).toMinutes();
        long finalDays = start.until(congratulationCall, ChronoUnit.DAYS);
        System.out.println("Total amount of days: ");
        System.out.println(finalDays);
        long finalMinutes = start.until(congratulationCall.minusSeconds(546), ChronoUnit.MINUTES);
        // long totalMinutes = ChronoUnit.MINUTES.between(start, congratulationCall);


        System.out.println(finalMinutes * 1.39);


    }

    private static boolean isIncludedInFirstOption(LocalDateTime arriveToHotel, LocalTime souna1, LocalTime souna2) {
        return arriveToHotel.toLocalTime().isAfter(souna1) && arriveToHotel.toLocalTime().isBefore(souna2);
    }

    private static Boolean isMassageDay(LocalDateTime arriveToHotel) {
        return arriveToHotel.getDayOfWeek().equals("THURSDAY") || arriveToHotel.getDayOfWeek().equals("SUNDAY");

    }

}
