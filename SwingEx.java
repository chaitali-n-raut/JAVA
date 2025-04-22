import javax.swing.*;
import java.awt.*;

public class SwingEx 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // using absolute layout

        JLabel l1 = new JLabel("Username:");
        JTextField t1 = new JTextField();

        JLabel l2 = new JLabel("Password:");
        JTextField t2 = new JTextField();

        JButton b = new JButton("Submit");

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 150, 30);

        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 150, 30);

        b.setBounds(130, 160, 100, 40);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b);

        frame.setVisible(true);
    }
}

