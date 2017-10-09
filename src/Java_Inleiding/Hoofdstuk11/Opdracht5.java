package Java_Inleiding.Hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class Opdracht5 extends Applet {

    public void init() {
        setSize(350, 130);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int x = 20;
        int y = 20;


        while(teller <= 10) {



            g.drawRect(x,y,20,20);

            x = (x + 20);
            y = (y + 20);
            teller++;
        }
    }
}