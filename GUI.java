package JS;

import javax.swing.*;
import java.awt.event.*;
public class GUI {
    static int num = 0;
    public static void main(String[] args){
        JButton happybutton = new JButton("행복버튼");
        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("누른 횟수: ");
        happybutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                num += 1;
                label.setText("누른 횟수: " + num);

            }
        });
        JPanel panel = new JPanel();
        panel.add(happybutton);
        panel.add(label);

        frame.add(panel);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
}
