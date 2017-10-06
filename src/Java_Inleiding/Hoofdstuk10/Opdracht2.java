package Java_Inleiding.Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht2 extends Applet {

    TextField TekstVak1;
    TextField TekstVak2;
    double Cijfer1;
    double Cijfer2;
    String Bericht;
    String Bericht2;

    public void init() {
        this.setSize(new Dimension(350,150));
        TekstVak1 = new TextField("", 5);
        TekstVak1.addActionListener(new VakListener());
        TekstVak2 = new TextField("", 5);
        TekstVak2.addActionListener(new VakListener());

        add(TekstVak1);
        add(TekstVak2);

        Bericht = "";
        Bericht2 = "";

    }

    public void paint(Graphics g) {
        g.drawString( Bericht, 50, 60 );
        g.drawString( Bericht2, 50, 80 );
    }



    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Cijfer1 = Integer.valueOf(TekstVak1.getText());
            Cijfer2 = Integer.valueOf(TekstVak2.getText());


            if (Cijfer1 > Cijfer2) {
                Bericht = "Het grootste getal is : " + Cijfer1;
                Bericht2 = "Het kleinste getal is : " + Cijfer2;
            }
            else if (Cijfer2 > Cijfer1) {
                Bericht = "Het grootste getal is : " + Cijfer2;
                Bericht2 = "Het kleinste getal is : " + Cijfer1;
            }

            repaint();
        }

    }

}