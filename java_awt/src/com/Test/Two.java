import java.applet.Applet;
import java.awt.Graphics;
public class Two extends Applet{
    public void paint(Graphics g){
        String str=getParameter("msg");

        g.drawString(str,150,150);
    }
}

/*
<applet code="Two.class" width="1000" height="1000">
<param name="msg" value="Welcome to applet">
</applet>
*/