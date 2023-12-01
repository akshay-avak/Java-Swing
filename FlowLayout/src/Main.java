import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        /*sometimes button doesn't appear so add frame.setVisible(true) at the end.*/
//        JButton button1 = new JButton("1");//1 inside will be shown inside of the button.
//        frame.add(button1);
        frame.add(new JButton("1"));//same code as above two line.
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));


        frame.setVisible(true);
    }
}