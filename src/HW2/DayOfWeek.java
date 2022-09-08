package HW2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the month as an integer:");
        int month = s.nextInt();
        System.out.print("Enter the day as an integer");
        int day = s.nextInt();
        System.out.print("Enter the year as an integer");
        int year = s.nextInt();
        day_of_week(month, day, year);

    }
    public static void day_of_week(int month, int day, int year) {
        int year_1 = year - (14 - month)/12;
        int x = year_1 + year_1 / 4 - year_1 / 100 + year_1 / 400;
        int month_1 = month + 12 *(( 14 - month)/ 12) -2;
        int day_1 = (day + x + 31 * month_1/ 12) % 7;
        System.out.print(day_1);
    }
}
