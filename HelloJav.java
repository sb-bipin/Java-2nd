
import java.applet.Applet;
import java.awt.Graphics;
public class HelloJav extends Applet {
    String msg="";
    String msg1="";
    public void init(){
        msg="Hello World SB";
        msg1=getParameter("Message");
    } 
    public void start(){
        System.out.println("Start called.");
    }
    public void stop(){
        System.out.println("Stop called.");
    }
    public void destroy(){
        System.out.println("Code Destroyed.");
    }
    public void paint(Graphics g){
        g.drawString(msg,20,20);
        g.drawString(msg1,50,50);
    }
}

/* 

<applet code="HelloJav" width="100" height="100"  >
<param name="Message" value="Hello World">
</applet>


 */

