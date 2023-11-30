import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
        JLabel label= new JLabel();
        label.setText("HI!");
        ImageIcon icon = new ImageIcon("largethumb.png");
        label.setIcon(icon);//this text+image can be added to redPanel,bluePanel,greenPanel by redPanel.add(label);
//        label.setVerticalAlignment(JLabel.BOTTOM);//no need of these two if we are using null-
//        label.setHorizontalAlignment(JLabel.RIGHT);//- layout manager use when using border layout manager.
        label.setBounds(0,100,200,100);

        //JPanel is GUI component acting as a container to hold other components.
        JPanel redPanel = new JPanel();//instance of a JPanel .
        redPanel.setBackground(Color.red);//setting color of JPanel object.
        redPanel.setBounds(0,0,250,250);//setting the position of JPanel object.
//        redPanel.setLayout(new BorderLayout());//setting layout to test the position of text+image
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
/*After creating JPanel objects and setting them up they should
 be added to frame by frame.add(redPanel) etc*/
//        greenPanel.setLayout(new BorderLayout());//layout which the frame uses.
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);


        greenPanel.add(label);//adding text+image label to red panel
        greenPanel.add(label);

//        frame.add(label);//for this line to work frame.setLayout(null) should be commented and frame.add(redPanel),green,blue panel should be commented
    }
}

//