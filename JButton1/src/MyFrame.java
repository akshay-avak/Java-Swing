import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("finger.png");
        ImageIcon icon1 = new ImageIcon("face.png");

        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(250,300,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200,200,250,100);
        button.addActionListener(this);
        button.setText("I'm a Button");
        button.setFocusable(false);

        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setIconTextGap(-10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("HAHAHAHA");
            label.setVisible(true);
        }
    }
}
