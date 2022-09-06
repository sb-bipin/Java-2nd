
import java.awt.*;
import java.awt.Button.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormModel //implements WindowListener
{
    Frame f;
    public void form(){
        Frame f=new Frame(); 
        f.setTitle("My Form frame");
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        Label l1=new Label();
        l1.setText("Name::");
        l1.setBounds(20, 30, 50, 30);
        f.add(l1);

        Label l2=new Label("Address::");
        l2.setBounds(20,50 , 100, 30);
        f.add(l2);

        Label l3=new Label("Email::");
        l3.setBounds(20,70 , 50, 30);
        f.add(l3);

        Button bt1=new Button("Save");
        bt1.addActionListener(
            (ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Save Button Clicked.");
            }
        }
        );
        bt1.setBounds(50, 100, 80, 50);
        f.add(bt1); 
    } 
    
public static void main(String[] args) {
    FormModel fm=new FormModel();
    fm.form();
    
}
}  
