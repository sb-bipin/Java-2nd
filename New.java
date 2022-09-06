import java.applet.Applet;
import java.awt.Graphics;

public class New{
	String msg="";
	int x-cod, y-cod;
	public void init()
	{
		msg= getParameter("msg");
		x-cod =(int) getParameter("x-cod");
		y-cod = (int) getParameter("y-cod");
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x-cod,y-cod);
	}
/*
<applet code="New" height="50" width="50">
	<param name="msg" value="Hello World!">
	<param name="msg" value="30">
	<param name="msg" value="40">
</applet>