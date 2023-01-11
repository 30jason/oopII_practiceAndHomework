
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

     class text extends JFrame{
        text(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JPanel Demo");
        setBounds(100,100,650,450);
        setLayout(null);

        String st = "My name IS Jason";
        
        JTextArea jta = new JTextArea(st);
        add(jta);
        jta.setBounds(50,50,300,200);
        //jta.setLineWrap(true);

        JScrollPane jsp = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(50,50,300,200);
        add(jsp);

        String[] city = {"台北","台中","台南","高雄","屏東"};
        JList<String> jl1 = new JList<>(city);

        JPanel jp1 = new JPanel();
        add(jp1);
        jp1.setBounds(300,150,150,200);
        jp1.add(jl1);

        JComboBox<String> jcb1 = new JComboBox<>(city);
        JPanel jp2 = new JPanel();
        add(jp2);
        jp2.setBounds(350,150,150,200);
        jp2.add(jcb1);

        setVisible(true);
        }
    }


