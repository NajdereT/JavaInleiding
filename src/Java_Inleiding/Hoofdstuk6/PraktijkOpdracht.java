package Java_Inleiding.Hoofdstuk6;
//made by Najdere
import java.applet.Applet;
import java.awt.*;


public class PraktijkOpdracht extends Applet {
    double a, b, c;
    double gemiddelde;
    double keer;
    double uitkomst;
    double terug;
//
    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        gemiddelde = (a+b+c)/3;
        keer = gemiddelde*10;
        uitkomst = (int)(keer);
        terug =  uitkomst/10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + terug, 20, 20);
    }
}