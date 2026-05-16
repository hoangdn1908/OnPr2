package Final;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    private JTextField txt;
    private JButton btn;
    private JLabel lbl;

    public Demo()
    {
        setSize(300,200);
        setLayout(null);
        txt = new JTextField();
        txt.setBounds(50,60,200,30);
        add(txt);
        btn = new JButton();
        btn.setBounds(50,60,200,30);
        add(btn);
        lbl  = new JLabel("Result: ");
        lbl.setBounds(50,140,200,30);
        add(lbl);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double c = Double.parseDouble(txt.getText());
                double calc = (9 / 5 * c) + 32;
                lbl.setText("Result: " + calc);
            }
        });
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
