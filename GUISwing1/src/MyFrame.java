import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
//        JFrame frame = new JFrame();//creating a jframe object


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//control what happens when close button is pressed
        this.setTitle("Akshay's Jframe");//sets title of frame
        this.setSize(400,400);//sets size x and y dimensions
        this.setResizable(false);//prevents resizing of frame
        this.setVisible(true);//making the jframe visible
        this.getContentPane().setBackground(Color.YELLOW);//changing bg color
        this.getContentPane().setBackground(new Color(123,50 ,250));//changing bg color with rgb values
        this.getContentPane().setBackground(new Color(0xbb22ff));

        ImageIcon icon = new ImageIcon("batlogo.png");//object for icon of frame
        this.setIconImage(icon.getImage());//setting icon of frame
    }
}
