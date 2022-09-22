package HW4;

import java.util.Scanner;

public class Investment {
    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);
    }

    public static void main(String[] args) {

        // prompt the user for c, r, t, n
        // and call the function with the inputted values

        Scanner s = new Scanner(System.in);
        boolean valid_c = false;
        double c = 0;
        while (!valid_c) {
            System.out.print("Please enter initial deposit as a decimal:");
            if (s.hasNextDouble()) {
                c = s.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: Initial deposit cannot be negative. You entered %.2f\n", c);
                } else {
                    valid_c = true;
                }
            }
            else {
                System.out.printf("Error: You must enter a decimal number. You entered \"%s\"\n", s.next());
            }
        }
        boolean valid_r = false;
        double r = 0;
        while (!valid_r) {
            System.out.print("Please enter interest rate as a decimal (between 0 and 1):");
            if (s.hasNextDouble()) {
                r = s.nextDouble();
                if (r > 1 || r < 0) {
                    System.out.printf("Error: Interest rate must be a decimal between 0 and 1. You entered %.2f\n", r);
                } else {
                    valid_r = true;
                }
            }
            else {
                System.out.printf("Error: You must enter a decimal number (between 0 and 1). You entered \"%s\"\n", s.next());
            }
        }
        boolean valid_t = false;
        int t = 0;
        while (!valid_t) {
            System.out.print("Please enter number of years as an integer:");
            if (s.hasNextInt()) {
                t = s.nextInt();
                if (t < 0) {
                    System.out.printf("Error: Number of years must be positive. You entered %,d %n", t);
                } else {
                    valid_t = true;
                }
            }
            else {
                System.out.printf("Error: Years must be entered as a positive integer. You entered \"%s\"\n", s.next());
            }
        } //while
        boolean valid_n = false;
        int n = 0;
        while (!valid_n) {
            System.out.print("Please enter number of times compounded as an integer:");
            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n < 0) {
                    System.out.printf("Error: Number of times compounded must be positive. You entered %,d %n", n);
                } else {
                    valid_n = true;
                }
            }
            else {
                System.out.printf("Error: Number times compounded must be a positive integer. You entered \"%s\"\n", s.next());
            }
        }
        System.out.printf("Your investment is worth %.2f",
                investment(c, r, t, n));
    }
}

