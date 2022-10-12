package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats(double [] args) {

        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0.0;
        int count = 0;
        int count2 = 0;
        // read each line of the web file
        while (s.hasNextLine()) {
            String line = s.nextLine();  // read a line of the web site
            if (line.indexOf("#") == 1) {   // modify condition
                sum += Double.parseDouble(line);
                count += 1;
            }
        }

            Arrays.sort(args);
            System.out.printf("The average swallow speed = %.2f\n", (Double) sum / (int) count);
            System.out.printf("The maximum swallow speed is %.2f\n", args[0]);
            System.out.printf("The minimum swallow speed is %.2f\n", args[args.length - 1]);
        } // avg_swallow_speed

    public static void main(String[] args) {
        double [] nums = {10.1, 12.1, 9.8, 8.9, 10.3, 9.2, 9.6, 9.2, 10.1, 11.7,
                12.0, 10.0, 99.9, 8.8, 11.9, 12.0, 0.0, 9.9, 9.8, 10.2};
        swallow_stats(nums);
    }
}