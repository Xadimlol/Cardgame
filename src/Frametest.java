import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frametest extends JFrame {
    private JLabel label1;
    private JLabel label2;

    private JButton button1;
    private JButton button2;
    private JTextField textfield;
    int x = 0, y = 0;


    public Frametest() {
        setLayout(new FlowLayout());


        textfield = new JTextField("test");
        add(textfield);

        button1 = new JButton("Eins");
        add(button1);

        label1 = new JLabel("");
        add(label1);

        button2 = new JButton("Zwei");
        add(button2);

        label2 = new JLabel("");
        add(label2);

        event e = new event();
        button1.addActionListener(e);

        button2.addActionListener(e);

    }

    private class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (label1.getText().equals("") & e.getSource() == button1) {
                label1.setText("Fischi");
            }else if (label1.getText().equals("Fischi") & e.getSource() == button1) {
                label1.setText("");
            }else if(label2.getText().equals("") & e.getSource() == button2) {
                label2.setText("nicht Fischi");
            }else if (label2.getText().equals("nicht Fischi") & e.getSource() == button2){
                label2.setText("");
            }
        }
    }



}


