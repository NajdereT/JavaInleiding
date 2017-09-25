package Java_Inleiding.Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init () {
        setBackground(Color.black);

    }

    public void paint (Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect(70,40,50,120);

        g.setColor(Color.red);
        g.fillOval(75,40,40,40);

        g.setColor(Color.orange);
        g.fillOval(75,80,40,40);

        g.setColor(Color.green);
        g.fillOval(75,120,40,40);

        g.setColor(Color.magenta);
        g.fillRect(90,160,10,70);



    }


}
