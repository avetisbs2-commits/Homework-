package enumeration_homework;

public class DayChecker {

    public static void checkDayType(Day day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(day + " is a weekend.");
                break;
            default:
                System.out.println(day + " is a weekday.");
                break;
        }
    }

    public static void main(String[] args) {
        checkDayType(Day.MONDAY);
        checkDayType(Day.FRIDAY);
        checkDayType(Day.SUNDAY);
    }
}
