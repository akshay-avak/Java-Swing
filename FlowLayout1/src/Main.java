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
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);

        panel.setLayout(new FlowLayout());
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}