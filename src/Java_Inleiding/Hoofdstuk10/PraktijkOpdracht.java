package Java_Inleiding.Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {

    TextField TekstVak1;
    double Invoer;
    String Bericht;
    Button Knop;

    public void init() {
        setSize(300, 130);

        TekstVak1 = new TextField("", 25);

        add(TekstVak1);

        Knop = new Button("Ok" );
        KnopListener kl = new KnopListener();
        Knop.addActionListener( kl );
        add(Knop);

        Bericht = "Voer je cijfer in.";

    }

    public void paint(Graphics g) {
        g.drawString( Bericht, 50, 60 );
    }



    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            if(TekstVak1.getText().isEmpty()) {

            }else {

                Invoer = Double.parseDouble(TekstVak1.getText());

                if (Invoer >= 1 && Invoer <= 3 ) {
                    Bericht = "Uw cijfer is: Slecht";
                }
                else if (Invoer == 4) {
                    Bericht = "Uw cijfer is: Onvoldoende";
                }
                else if (Invoer == 5) {
                    Bericht = "Uw cijfer is: Matig";
                }
                else if (Invoer >= 6 && Invoer <= 7 ) {
                    Bericht = "Uw cijfer is: Voldoende";
                }
                else if (Invoer >= 8 && Invoer <= 10 ) {
                    Bericht = "Uw cijfer is: Goed";
                }
                else {
                    Bericht = "verkeerd cijfer ingevoerd.";
                }

                TekstVak1.setText("");
                repaint();

            }

        }
    }

}