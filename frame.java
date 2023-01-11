import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.GridLayout;
public class frame extends JFrame  {
    public frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("caculator");
        setVisible(true);
        JPanel pane = new JPanel();
        pane.setLayout(new GridLayout(3, 3, 5 , 5));
        setContentPane(pane);
        JButton JB[] = new JButton[10];
        for (int i = 1; i <= 9; i++) {
            JB[i] = new JButton();
            JB[i].setText(Integer.toString(i));
            JB[i].setSize(10, 10);
            pane.add(JB[i]);
        }
    }
}
