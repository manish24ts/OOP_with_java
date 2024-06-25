import java.util.*;

public class CalanderClassExample {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println("Current date and time: \n=>" + cal);

        System.out.println("Current Calendar type: \n" + cal.getCalendarType());

        System.out.println("Current date and time: \n=>" + cal.getTime());

        System.out.println("Current date time zone: \n=>" + cal.getTimeZone());

        System.out.println("Calendar filed 1 (year): " + cal.get(1));

        System.out.println("Calendar day in integer form: " + cal.getFirstDayOfWeek());

        System.out.println("Calendar weeks in a year: " + cal.getWeeksInWeekYear());

        System.out.println("Time in milliseconds: \n" + cal.getTimeInMillis());

        System.out.println("Available Calendar types: " + cal.getAvailableCalendarTypes());

        System.out.println("Calendar hash code: \n" + cal.hashCode());

        System.out.println("Is calendar supports week date? " + cal.isWeekDateSupported(0));

        System.out.println("Calendar string representation: \n" + cal.toString());
    }
}