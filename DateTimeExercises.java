import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeExercises {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Calculates age in years, months, and days between a fixed birthdate
     * and a date entered by the user, using Period.between.
     */
    static void calculateAge() {
        LocalDate birthdate = LocalDate.parse("2008-11-20");

        System.out.print("Enter comparison year: ");
        int year = scanner.nextInt();
        System.out.print("Enter comparison month: ");
        int month = scanner.nextInt();
        System.out.print("Enter comparison day: ");
        int day = scanner.nextInt();

        LocalDate inputDate = LocalDate.of(year, month, day);
        Period age = Period.between(birthdate, inputDate);

        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
    }

    /**
     * Reads a date from the user and prints the date 100 days after it,
     * using LocalDate.plusDays.
     */
    static void addDaysToDate() {
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        LocalDate futureDate = LocalDate.of(year, month, day).plusDays(100);
        System.out.println("100 days later: " + futureDate);
    }

    /**
     * Prints the current time in Tokyo, New York, and Yerevan,
     * using ZonedDateTime.now(ZoneId) with a custom formatter.
     */
    static void printCurrentTimeInZones() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime yerevanTime = ZonedDateTime.now(ZoneId.of("Asia/Yerevan"));

        System.out.println("Tokyo: " + tokyoTime.format(formatter));
        System.out.println("New York: " + newYorkTime.format(formatter));
        System.out.println("Yerevan: " + yerevanTime.format(formatter));
    }

    /**
     * Converts a fixed meeting time in Yerevan to the equivalent local time
     * in London and Los Angeles, using ZonedDateTime.withZoneSameInstant.
     */
    static void convertMeetingTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd HH:mm");

        LocalDateTime meetingTime = LocalDateTime.parse("2025-07-26T14:00");
        ZonedDateTime yerevanTime = meetingTime.atZone(ZoneId.of("Asia/Yerevan"));
        ZonedDateTime londonTime = yerevanTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime losAngelesTime = yerevanTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println("Yerevan: " + yerevanTime.format(formatter));
        System.out.println("London: " + londonTime.format(formatter));
        System.out.println("Los Angeles: " + losAngelesTime.format(formatter));
    }

    /**
     * Calculates and prints the duration between two fixed LocalTime values,
     * broken down into hours and minutes, using Duration.between.
     */
    static void calculateDuration() {
        LocalTime time1 = LocalTime.of(14, 22);
        LocalTime time2 = LocalTime.of(20, 12);

        Duration duration = Duration.between(time1, time2);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;

        System.out.println("Duration: " + hours + "h " + minutes + "m");
    }

    /**
     * Reads a date from the user and prints which day of the week it falls on,
     * using LocalDate.getDayOfWeek.
     */
    static void printDayOfWeek() {
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        LocalDate inputDate = LocalDate.of(year, month, day);
        System.out.println(inputDate + " is " + inputDate.getDayOfWeek());
    }

    /**
     * Prints every time zone ID available on this JVM,
     * using ZoneId.getAvailableZoneIds().
     */
    static void printAllZoneIds() {
        String[] zoneIds = ZoneId.getAvailableZoneIds().toArray(new String[0]);
        for (String id : zoneIds) {
            System.out.println(id);
        }
    }


    public static void main(String[] args) {
        calculateAge();
        addDaysToDate();
        printCurrentTimeInZones();
        convertMeetingTime();
        calculateDuration();
        printDayOfWeek();
        printAllZoneIds();
    }
}
