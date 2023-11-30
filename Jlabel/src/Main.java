import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("goku.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();//creates a Jlabel instance
        label.setText("I'm The best");
        label.setHorizontalTextPosition(JLabel.CENTER);//sets position of text horizontally left,right,center,bottom
        label.setVerticalTextPosition(JLabel.BOTTOM);//sets position of text vertically left,right,center,bottom
        label.setForeground(Color.red);//set color of text label
        label.setFont(new Font("MV Boli",Font.ITALIC,30));//set font style of label text
        label.setIconTextGap(30);//set the distance between text and image
        label.setBackground(Color.black);//sets the bg color of label
        label.setOpaque(true);//makes the above bg color visible
        label.setIcon(image);//used to add label image
        label.setBorder(border);//used to set the border of label by using BorderFactory

        label.setVerticalAlignment(JLabel.TOP);//set vertical alignment of text+image
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal alignment of text+image

        /*used with frame.setLayout(null) to position the label-*/
//        label.setBounds(100,100,300,300);
        /*-where we want withinn the frame x,y,width,height*/


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
//        frame.setLayout(null);

        frame.add(label);
        frame.pack();//frame size will be set automatically based on the size of it's content.
        //add all LABLELS first and then use fram.pack() method







    }
}