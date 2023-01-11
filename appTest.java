import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.FlowLayout;
import javax.print.attribute.standard.JobHoldUntil;
class Fframe extends JFrame implements ActionListener {
    private JCheckBox ckb1 = new JCheckBox();
    private JCheckBox ckb2 = new JCheckBox();
    private JCheckBox ckb3 = new JCheckBox();
    private JRadioButton jrb1 = new JRadioButton();
    private JRadioButton jrb2 = new JRadioButton();
    private JLabel jl1 = new JLabel();
    Fframe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Jpanel Demo");
        setBounds(50,50,280,200);
        setLayout(null);
        JPanel pan = new JPanel();
        add(pan);
        pan.setBounds(0,20,150,120);
        pan.setBackground(Color.LIGHT_GRAY);
        pan.setBorder(BorderFactory.createTitledBorder("Jpanel 1"));
        pan.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton btn1 = new JButton("按鈕1");
        btn1.addActionListener(this);
        pan.add(btn1);
        JButton btn2 = new JButton("按鈕2");
        btn2.addActionListener(this);
        pan.add(btn2);
        JButton btn3 = new JButton("按鈕3");
        btn3.addActionListener(this);
        pan.add(btn3);

        JPanel pan2 = new JPanel();
        add(pan2);
        pan2.setBorder(BorderFactory.createTitledBorder("Jpanel 2"));
        pan2.setBackground(Color.LIGHT_GRAY);
        pan2.setBounds(250,20,150,120);
        pan2.setLayout(new FlowLayout(FlowLayout.LEFT));
        ckb1 = new JCheckBox("吃飯");
        ckb1.addActionListener(this);
        pan2.add(ckb1);
        ckb2 = new JCheckBox("睡覺");
        pan2.add(ckb2);
        ckb2.addActionListener(this);
        ckb3 = new JCheckBox("不知道");
        pan2.add(ckb3);
        ckb3.addActionListener(this);

        JPanel pan3 = new JPanel();
        add(pan3);
        pan3.setBackground(Color.LIGHT_GRAY);
        pan3.setBounds(500,20,150,120);
        pan2.setLayout(new FlowLayout(FlowLayout.LEFT));
        ButtonGroup bg = new ButtonGroup();
        jrb1 = new JRadioButton("male", true);
        bg.add(jrb1);
        jrb2 = new JRadioButton("female");
        bg.add(jrb2);
        pan3.add(jrb1);
        jrb1.addActionListener(this);
        pan3.add(jrb2);
        jrb2.addActionListener(this);
        jl1 = new JLabel("請選擇性別，興趣");
        add(jl1);
        jl1.setBackground(Color.LIGHT_GRAY);
        jl1.setBounds(0,150,470,20);
        jl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setVisible(true);

    };

    public void actionPerformed(ActionEvent e) {
       String lbshow = "";
       if (jrb1.isSelected()) {
        lbshow += "帥哥好";
       }else {
        lbshow += "美女好";
       }
       if (!(ckb1.isSelected() || ckb2.isSelected() || ckb3.isSelected())) {
        lbshow += "您的興趣是什麼?";
       }else {
        String interest = "";
        if (ckb1.isSelected()) {
            interest += "吃飯";
        }
        if (ckb2.isSelected()) {
            interest += "睡覺";
        }
        if (ckb3.isSelected()) {
            interest += "不知道";
        }
        lbshow += "的興趣是 " + interest;
       }
       jl1.setText(lbshow);
    }
}
public class appTest {
    public static void main (String [] args) {
        Fframe f = new Fframe();
    }
}


