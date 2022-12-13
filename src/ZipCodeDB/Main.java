package ZipCodeDB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY", "Canton",
                75.16, 44.59, 11781);
        System.out.println(z1);

        Zipcode z2 = new Zipcode("13361", "NY", "Jordanville",
                74.82, 42.89, 395);
        System.out.println(z2);

        Database db = new Database();



        System.out.println(db.findByZip1("12901"));
        System.out.println(db.findByZip1("13361"));
        System.out.println(db.findByZip1("Hello"));

        System.out.println(db.search("43221"));

        WeatherObservation wob =  db.search("13617").getWeatherData();
        System.out.println(wob);

        return;
    }
}
