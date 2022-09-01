package HW1;

public class Time {
    public static void main(String [] args) {
        int hour = 20;
        int minute = 17;
        int second = 46;
        System.out.println("Homework 1 ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.print(" is ");
        double seconds_since_midnight = ((hour * 60) * 60) + (minute * 60) + second;
        System.out.print(Math.round(seconds_since_midnight));
        System.out.println(" seconds since midnight.");
        System.out. print("There are ");
        double seconds_in_day = (24 *60 *60);
        System.out.print(Math.round(seconds_in_day - seconds_since_midnight));
        System.out. println(" seconds remaining in the day. ");
        System.out. print(Math.round((seconds_since_midnight/seconds_in_day)*100));
        System.out. println("% of the day has passed.");
    }
}
