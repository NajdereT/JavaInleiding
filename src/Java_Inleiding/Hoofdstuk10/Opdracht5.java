package Java_Inleiding.Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class Opdracht5 extends Applet {

    TextField TekstVak1;
    double Invoer;
    String Regel1;
    String Regel2;
    String Regel3;
    Button Knop;
    double[] cijfers;
    int i;
    int teller;
    double gemiddelde;

    public void init() {
        setSize(300, 130);

        TekstVak1 = new TextField("", 5);

        add(TekstVak1);

        Knop = new Button("Bereken" );
        KnopListener kl = new KnopListener();
        Knop.addActionListener( kl );
        add(Knop);

        Regel1 = "Voer nu je cijfers in.";
        Regel2 = "";
        Regel3 = "";

        cijfers = new double[20];
        i = 0;

    }

    public void paint(Graphics g) {
        g.drawString( Regel1, 50, 60 );
        g.drawString( Regel2, 50, 80 );
        g.drawString( Regel3, 50, 100 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Invoer = Double.parseDouble(TekstVak1.getText());

            if (Invoer >= 5.5) {
                Regel1 = "Het laatste ingevoerde cijfer was een " + Invoer + " , dit is een voldoende.";
            }
            else {
                Regel1 = "Het laatste ingevoerde cijfer was een " + Invoer + " , dit is een onvoldoende.";
            }

            cijfers[i] = Invoer;

            gemiddelde = 0;
            for(teller = 0 ; teller <= i ; teller++) {
                gemiddelde = gemiddelde + cijfers[teller];
            }
            i++;

            DecimalFormat formatter = new DecimalFormat("#.#");

            if ((gemiddelde / i) > 5.5) {
                Regel2 = "je gemiddelde is een " + formatter.format((gemiddelde / i)) + ", je bent tot dusver geslaagd!";
            }
            else {
                Regel2 = "je gemiddelde is een " + formatter.format((gemiddelde / i)) + ", je bent gwn gezakt, hahaha .";
            }

            Regel3 = "Laatst ingevoerde cijfers:  ";
            for(teller = 0 ; teller < i ; teller++) {
                Regel3 = Regel3 + cijfers[teller] + "  -  ";
            }

            TekstVak1.setText("");
            repaint();
        }
    }

}