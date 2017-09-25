package Java_Inleiding.Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {
    int a, b, uitkomstu,uitkomstd,uitkomstj;


    public void init() {
        a = 60;
        b = 60;
        uitkomstu = a*b;
        uitkomstd = 24*uitkomstu;
        uitkomstj = 365*uitkomstd;
    }

    public void paint(Graphics g) {
        g.drawString("Er zitten " + uitkomstu + " seconden in een uur.", 20, 20);
        g.drawString("Er zitten " + uitkomstd + " seconden in een dag.", 20, 40);
        g.drawString("Er zitten " + uitkomstj + " seconden in een jaar.", 20, 60);
    }
}