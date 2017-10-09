package Java_Inleiding.Hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class Opdracht4 extends Applet {

    public void init() {
        setSize(350, 130);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int x = 20;


        while(teller <= 10) {

            g.drawString(""+ (teller*3),x,20);

            x += 20;
            teller++;
        }
    }
}