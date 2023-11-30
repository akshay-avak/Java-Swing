import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class MyFrame1 extends JFrame implements ActionListener {//commented for using regular expression
public class MyFrame1 extends JFrame {
    JButton button;
    MyFrame1(){
        button = new JButton();
        button.setBounds(200,200,100,50);
//        button.addActionListener(this);
        button.addActionListener(e-> System.out.println("HAHAHAHAH"));// REGULAR EXPRESSION
        //Line above can minimise code

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
    }
//commented below code for using regular expression
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==button){
//            System.out.println("HAHAHAHA");
//        }
//    }
}
