package Java_Inleiding.Hoofdstuk6;
//made by the great Najdère
import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double a,b,uitkomst;


    public void init() {
        a = 112;
        b = 4;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("Ik krijg: $" + uitkomst , 20, 20);
        g.drawString("Jan krijgt: $" + uitkomst , 20, 35);
        g.drawString("Ali krijgt: $" + uitkomst , 20, 50);
        g.drawString("Jeanette krijgt: $" + uitkomst , 20, 65);



    }
}