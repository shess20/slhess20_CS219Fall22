package HW3;

import java.util.Scanner;

public class Investment {
    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);

    }

    public static void main(String[] args) {

        // prompt the user for c, r, t, n
        // and call the function with the inputted values

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter initial deposit as a decimal:");
        double c;
        if (s.hasNextDouble()) {
            c = s.nextDouble();
            if (c <0) {
                System.out.print("Error: Value cannot be negative");
                return;
            }
        }
        else {
            System.out.printf("Error: You entered \"%s\" - You must enter a positive decimal value.", s.next());
            return;
            }
        System.out.print("Please enter interest rate as a decimal (decimal must be between 0 and 1):");
        double r;
        if (s.hasNextDouble()) {
            r = s.nextDouble();
            if (r < 0 || r > 1) {
                System.out.print("Error: Interest rate value must be a decimal between zero and one.");
                return;
            }
        }
        else {
            System.out.printf("Error: You entered \"%s\" - You must enter a positive decimal value.", s.next());
            return;
        }
        System.out.print("Please enter number of years as an integer:");
        int t;
        if (s.hasNextInt()) {
            t = s.nextInt();
            if (t < 0) {
                System.out.print("Error: Years value cannot be negative.");
                return;
            }
        }
        else {
            System.out.printf("Error: You entered \"%s\" - You must enter a positive integer.", s.next());
            return;
        }

        System.out.print("Please enter number of times compounded as an integer:");
        int n;
        if (s.hasNextInt()) {
            n = s.nextInt();
            if (n < 0) {
                System.out.print("Error: Number of times compounded value cannot be negative.");
                return;
            }
        }
        else {
            System.out.printf("Error: You entered \"%s\" - You must enter a positive integer.", s.next());
            return;
        }
        System.out.printf("Your investment is worth %.2f",
                investment(c, r, t, n));
        }
    }
