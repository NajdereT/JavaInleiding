package Java_Inleiding.Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    public void init () {

    }

    public void paint (Graphics g) {
        g.drawLine(20,20,120,20);

        g.drawRect(20,40,100,30);

        g.drawRoundRect(20,80,100,30,30,20);

        g.setColor(Color.magenta);
        g.fillRect(130,20,100,40);
        g.setColor(Color.black);
        g.drawOval(130,20,100,40);

        g.setColor(Color.magenta);
        g.fillOval(130,70,100,40);

        g.setColor(Color.black);
        g.drawOval(240,20,100,40);
        g.setColor(Color.magenta);
        g.fillArc(240,20,100,40,0,45);

        g.setColor(Color.black);
        g.drawOval(250,70,60,60);






    }


}