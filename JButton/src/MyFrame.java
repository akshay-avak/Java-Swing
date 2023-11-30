import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame(){
        ImageIcon icon = new ImageIcon("finger.png");

        button = new JButton();//creating a button instance
        button.setBounds(200,200,250,100);//setting size of button
        button.addActionListener(this);//method to listen for action on the button like click
        button.setText("I'm a Button");//set text on button
        button.setFocusable(false);//removing the black border around the text of button
        button.setIcon(icon);//setting an image on the button
        button.setHorizontalTextPosition(JButton.CENTER);//hoirizontally align text position inside button
        button.setVerticalTextPosition(JButton.BOTTOM);//vertically aligining text position inside button
        button.setFont(new Font("Comic Sans",Font.BOLD,20));//setting font properties of button text
        button.setIconTextGap(-10);//setting the gap b/w text and icon(inside button)
        button.setForeground(Color.cyan);//setting font color of text inside button
        button.setBackground(Color.GRAY);//setting background color of button
        button.setBorder(BorderFactory.createEtchedBorder());//setting border around the button
//        button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
    }

    @Override//this method is added when implementing actionlistener interface
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("HAHAHAHA");
            button.setEnabled(false);
        }
    }
}
