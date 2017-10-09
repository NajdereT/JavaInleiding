package Java_Inleiding.Hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class Opdracht7 extends Applet {

    public void init() {
        setSize(350, 130);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int x = 300;
        int y = 300;
        int breedte = 10;
        int hoogte = 10;


        while(teller <= 50) {



            g.drawOval(x,y,breedte,hoogte);

            x = (x - 5);
            y = (y - 5);
            breedte = breedte + 10;
            hoogte = hoogte + 10;
            teller++;
        }
    }
}