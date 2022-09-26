import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class swingUI implements ActionListener {
     JFrame f;
     JTextField jtf;

    public void SwingUI(){
        f= new JFrame("Swing based frame");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        JLabel jl=new JLabel("Name:");
        jl.setBounds(10, 10, 100, 50);
        f.add(jl);

        jtf= new JTextField();
        jtf.setText("John Doe");
        jtf.setBounds(80, 10, 100, 50);
        jtf.setBackground(Color.YELLOW);
        f.add(jtf);


        JButton jb1=new JButton("OK");
        jb1.setBounds(20, 100, 100, 100);
        jb1.setBackground(Color.GRAY);
        jb1.addActionListener((ActionListener) this);
        jb1.setActionCommand("OK");
        f.add(jb1);

        JButton jb2=new JButton("CLEAR");
        jb2.setBounds(150, 100, 100, 100);
        jb2.setBackground(Color.GRAY);
        jb2.setActionCommand("CLEAR");
        f.add(jb2);
    }

    public static void main(String[] args) {
        swingUI si=new swingUI();
        si.SwingUI();
    }
    String cmd;
    @Override
    public void actionPerformed(ActionEvent e) {
        cmd=e.getActionCommand();

        if(cmd=="OK"){
            JLabel jl=new JLabel("WELCOME");
            jl.setBounds(20, 300, 100, 100);
            f.add(jl);
        }
        if(cmd=="CLEAR"){
            jtf.setText("");
            f.add(jtf);
        }

    }
}


