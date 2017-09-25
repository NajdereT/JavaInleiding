package Java_Inleiding.Hoofdstuk2;

import java.applet.Applet;
import java.awt.*;

public class H2opdracht1 extends Applet {

    public void init () {
        setBackground(Color.BLUE);

    }

    public void paint (Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Najdere,is de beste",50,60);

    }


}