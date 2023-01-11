import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener {
    private JPanel contentPane;
    MyFrame () {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("test");
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        JButton b1 = new JButton("button1");
        /*b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,b1.getText()+"不要亂按");
            }
        }
        );
        */
        b1.addActionListener(this);
        contentPane.add(b1, BorderLayout.NORTH);

        JButton b2 = new JButton("button2");
        /*b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "不要亂按");
            }
        }
        );
        */
        contentPane.add(b2, BorderLayout.SOUTH);

        JButton b3 = new JButton("button3");
        /*b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "不要亂按");
            }
        }
        );
        */
        contentPane.add(b3, BorderLayout.WEST);

        JButton b4 = new JButton("button4");
        /*b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "不要亂按");
            }
        }
        );
        /* */
        contentPane.add(b4, BorderLayout.EAST);
    }
    public void actionPerformed(ActionEvent e) {
        JButton nameB = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null, nameB.getText());
    }
}
public class swin {
    public static void main (String [] args) {
        MyFrame fr = new MyFrame();
    }
}