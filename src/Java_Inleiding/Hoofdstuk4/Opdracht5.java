package Java_Inleiding.Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init () {
        setBackground(Color.blue);

    }

    public void paint (Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillArc(100,100,100,100,90,110);


    }


}