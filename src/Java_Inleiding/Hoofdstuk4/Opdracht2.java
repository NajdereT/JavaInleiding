package Java_Inleiding.Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init () {
        setBackground(Color.red);

    }

    public void paint (Graphics g) {
        //driehoek
        g.drawLine(50,150,200,150);
        g.drawLine(50,150,125,50);
        g.drawLine(200,150,125,50);
        //vierkant huis
        g.drawRect(50,150,150,100);
        //deur
        g.drawRect(100,210,40,40);
        g.drawLine(130,235,135,235);
        //raam
        g.drawRect(160,160,30,30);
        g.drawLine(175,160,175,190);
        g.drawLine(160,175,190,175);
    }


}
