package Java_Inleiding.Hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class Opdracht9 extends Applet {

    public void init() {
        setSize(350, 130);
    }

    public void paint(Graphics g) {
        int rij = 1;
        int kolom = 1;

        while(rij <= 8 && kolom <=8) {

            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7 ) {

                if (rij == 1 || rij == 3 || rij == 5 || rij == 7) {
                    g.setColor(Color.white);
                    g.drawRect((kolom*20), (rij*20), 20, 20);
                } else {
                    g.setColor(Color.black);
                    g.fillRect((kolom*20), (rij*20), 20, 20);
                }

            }
            else if (kolom == 2 || kolom == 4 || kolom == 6 || kolom == 8 ) {

                if (rij == 1 || rij == 3 || rij == 5 || rij == 7) {
                    g.setColor(Color.black);
                    g.fillRect((kolom*20), (rij*20), 20, 20);
                } else {
                    g.setColor(Color.white);
                    g.drawRect((kolom*20), (rij*20), 20, 20);
                }

            }
            System.out.println("" + kolom + "  " + rij);
            kolom = kolom + 1;

            if (kolom == 9) {
                rij = rij + 1;
                kolom = 1;
            }

        }

        g.setColor(Color.black);
        g.drawRect(20, 20, (8*20) ,(8*20));

    }
}