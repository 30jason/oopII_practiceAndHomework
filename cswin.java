import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
class cMyFrame extends JFrame implements ActionListener {
    private JPanel contentPane;
    cMyFrame () {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("test");
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        JLabel lab1 = new JLabel("Hello Label");
        contentPane.add(lab1);

        JButton b1 = new JButton("button1");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(Color.ORANGE);
                //JOptionPane jp = new JOptionPane("TEST", JOptionPane.ERROR_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
                //contentPane.add(jp);
                //JOptionPane.showMessageDialog(null,b1.getText()+"不要亂按");
                //JOptionPane.showConfirmDialog(null, "error", "test")
            }
        }
        );
        b1.addActionListener(this);
        contentPane.add(b1, BorderLayout.NORTH);

        JButton b2 = new JButton("button2");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "不要亂按");
                lab1.setText("do not click me");
            }
        }
        );
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
        /* */
        contentPane.add(b4, BorderLayout.EAST);
        //ImageIcon img1 = new ImageIcon("");
        //JLabel lab2 = new JLabel();
        //lab2.setIcon(img1);
        //contentPane.add(lab2);
        //JTextField txt1 = new JTextField(10);
        //txt1.setToolTipText("enter your phone number");
        //contentPane.add(txt1);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        JButton nameB = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null, nameB.getText());
    }
}
public class cswin {
    public static void main (String [] args) {
        cMyFrame fr = new cMyFrame();
    }
}