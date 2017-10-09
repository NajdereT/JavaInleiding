package Java_Inleiding.Hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class Opdracht3 extends Applet {

    public void init() {
        setSize(350, 130);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int x = 20;

        int vorige = 0;
        int huidig = 1;
        int getal;

        if (vorige == 0) {

            g.drawString(""+ "1",x,20);

            x += 20;
            teller++;

        }

        while(teller <= 10) {

            getal = vorige + huidig;

            g.drawString(""+ getal,x,20);

            vorige = huidig;
            huidig = getal;

            x += 20;
            teller++;
        }
    }
}