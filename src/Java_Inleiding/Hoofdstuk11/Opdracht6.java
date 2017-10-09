package Java_Inleiding.Hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class Opdracht6 extends Applet {

    public void init() {
        setSize(350, 150);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int x = 100;
        int y = 100;
        int breedte = 20;
        int hoogte = 20;


        while(teller <= 5) {



            g.drawOval(x,y,breedte,hoogte);

            x = (x - 10);
            y = (y - 10);
            breedte = breedte + 20;
            hoogte = hoogte + 20;
            teller++;
        }
    }
}