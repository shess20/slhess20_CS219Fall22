package Exam1;

import java.util.Scanner;

public class Exam1 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        boolean valid_n = false;
        int n = 0;
        while (!valid_n) {
            System.out.print("Please enter a positive integer:");
            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n < 0) {
                    System.out.print("Error: Integer cannot be negative. You entered ");
                    System.out.println(n);
                }
                else {
                    valid_n = true;
                }
            } else {
                System.out.printf("Error: You must enter a positive integer. You entered \"%s\"\n", s.next());
            }
        }
        int count = 0;

        while (n > 0) {
            if (n % 10 < 7 && n % 10 > 2)
                count++;
            n = n / 10;
        }
        System.out.print("Number of digits between 2 and 7:  ");
        System.out.print(count);
    }
}
