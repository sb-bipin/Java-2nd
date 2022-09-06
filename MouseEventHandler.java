import java.awt.*; 
import java.applet.Applet;
import java.awt.event.*; 


public class MouseEventHandler extends MouseAdapter { 
    public Frame f ; 

    public void getReady(){ 
        f = new Frame("MouseEventHandling");
        f.setSize(300,300); 
        f.setLayout(null); 
        f.addMouseListener(this); 
        f.setVisible(true); 
    
    }
    public void mouseClicked (MouseEvent e) {    
                Graphics g = f.getGraphics();    
                g.setColor (Color.BLUE);    
                g.fillOval (e.getX(), e.getY(), 30, 30);    
            } 
    public static void main(String args[]){ 
        MouseEventHandler me =new MouseEventHandler(); 
        me.getReady(); 
    }

    
}