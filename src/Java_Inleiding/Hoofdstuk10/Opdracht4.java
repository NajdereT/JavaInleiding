package Java_Inleiding.Hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht4 extends Applet {

    TextField TekstVak1;
    TextField TekstVak2;
    int Invoer;
    int InvoerJ;
    String Bericht;

    public void init() {
        this.setSize(new Dimension(350,150));
        TekstVak1 = new TextField("", 5);
        TekstVak1.addActionListener(new VakListener());
        TekstVak2 = new TextField("", 5);
        TekstVak2.addActionListener(new VakListener());

        add(TekstVak1);
        add(TekstVak2);

        Bericht = "";
    }

    public void paint(Graphics g) {
        g.drawString( Bericht, 50, 60 );
    }



    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (TekstVak1.getText().equals("")){
                Bericht = "geen maand ingevoerd.";
            }
            else if (TekstVak2.getText().equals("")) {
                Bericht = "geen jaar ingevoerd.";
            }
            else{
                Invoer = Integer.parseInt(TekstVak1.getText());
                InvoerJ = Integer.parseInt(TekstVak2.getText());

                switch(Invoer) {
                    case 1 :
                        Bericht = "De 1e maand is januari, deze maand heeft 31 dagen.";
                        break;
                    case 2:
                        if (InvoerJ % 4 == 0){
                            Bericht = "De 2e maand is februari, deze maand heeft 29 dagen.";
                        }
                        else{
                            Bericht = "De 2e maand is februari, deze maand heeft 28 dagen.";
                        }
                        break;
                    case 3:
                        Bericht = "De 3e maand is maart, deze maand heeft 31 dagen.";
                        break;
                    case 4:
                        Bericht = "De 4e maand is april, deze maand heeft 30 dagen.";
                        break;
                    case 5:
                        Bericht = "De 5e maand is mei, deze maand heeft 31 dagen.";
                        break;
                    case 6:
                        Bericht = "De 6e maand is juni, deze maand heeft 30 dagen.";
                        break;
                    case 7:
                        Bericht = "De 7e maand is juli, deze maand heeft 31 dagen.";
                        break;
                    case 8:
                        Bericht = "De 8e maand is augustus, deze maand heeft 31 dagen.";
                        break;
                    case 9:
                        Bericht = "De 9e maand is september, deze maand heeft 30 dagen.";
                        break;
                    case 10:
                        Bericht = "De 10e maand is oktober, deze maand heeft 31 dagen.";
                        break;
                    case 11:
                        Bericht = "De 11e maand is november, deze maand heeft 30 dagen.";
                        break;
                    case 12:
                        Bericht = "De 12e maand is december, deze maand heeft 31 dagen.";
                        break;

                    default:
                        Bericht = "ongeldig maand nummer.";
                        break;
                }

            }

            repaint();
        }

    }

}