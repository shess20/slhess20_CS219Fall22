package ZipCodeDB;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CS219 Weather App");
        frame.add(new GUIPanel());
        frame.setVisible(true);

        // when the user clicks the x on the title bar they also stop running the main program.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack(); // makes the JFrame the size of the internal components

    }
}
