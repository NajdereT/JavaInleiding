package Java_Inleiding.Hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class Opdracht8 extends Applet {

    public void init() {
        setSize(350, 6130);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int breedte = 10;
        int hoogte = 10;


        while(teller <= 100) {



            g.drawOval(20,20,breedte,hoogte);

            breedte = breedte + 5;
            hoogte = hoogte + 5;
            teller++;
        }
    }
}