package Java_Inleiding.Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {

    TextField TekstVak1;
    TextField TekstVak2;
    double C1;
    double C2;
    String B;

    public void init() {
        this.setSize(new Dimension(350,150));
        TekstVak1 = new TextField("", 20);
        TekstVak1.addActionListener(new VakListener());
        TekstVak2 = new TextField("", 20);
        TekstVak2.addActionListener(new VakListener());

        add(TekstVak1);
        add(TekstVak2);

        B = "";

    }

    public void paint(Graphics g) {
        g.drawString( B, 50, 60 );
    }



    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            C1 = Integer.valueOf(TekstVak1.getText());
            C2 = Integer.valueOf(TekstVak2.getText());


            if (C1 > C2) {
                B = "Cijfer 1 is groter";
            }
            else if (C2 > C1) {
                B = "Cijfer 2 is groter";
            }

            repaint();
        }

    }

}