import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.io.IOException;
import java.awt.FlowLayout;
public class lframe extends JFrame implements ActionListener{
    public lframe() {
        JPanel contentPane = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("test");
        contentPane.setLayout(new FlowLayout());
        setContentPane(contentPane);
        JLabel lab1 = new JLabel("ID:");
        contentPane.add(lab1);
        JTextField txt1 = new JTextField(10);
        contentPane.add(txt1);
        JLabel lab2 = new JLabel("PWD:");
        contentPane.add(lab2);
        JTextField txt2 = new JTextField(10);
        contentPane.add(txt2);
        setVisible(true);

        JButton bt1 = new JButton("LOGIN");
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if (txt1.getText().equals("ddd") && txt2.getText().equals("1234")) {
                    int isOk = JOptionPane.showConfirmDialog(null, "Login Success", "Login", JOptionPane.INFORMATION_MESSAGE);
                    if (isOk == 0) {
                        Runtime rt = Runtime.getRuntime();
                        try {
                            Processs pc = rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe https://www.nuk.edu.tw");
                        }catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else {
                        return;
                    }
                }else {
                    JOptionPane.showConfirmDialog(null, "Login Failed", "Login", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        contentPane.add(bt1);
    }
}
