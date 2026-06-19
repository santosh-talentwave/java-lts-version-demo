package java8demo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today`s date: " + today);

        LocalDate event = LocalDate.of(2026, 6, 29);
        System.out.println("Event: " + event);

        System.out.println("=====================");
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        LocalTime meetingTime = LocalTime.of(23, 59, 59);
        System.out.println("Meeting time: " + meetingTime);

        System.out.println("=====================");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("DateTime: " + dateTime);

        LocalDateTime meetingDateTime = LocalDateTime.of(2026, 6, 29, 12, 59);
        System.out.println("Meeting date: " + meetingDateTime);

        System.out.println("=====================");
        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);

        System.out.println("=====================");
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2026, 12, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);

        long days = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days: " + days);

        System.out.println("=====================");
        LocalTime startTime = LocalTime.of(9, 19, 39);
        LocalTime endTime = LocalTime.of(23, 59, 59);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration);

        System.out.println("=====================");
        event.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Formated event: " + event);


    }
}
