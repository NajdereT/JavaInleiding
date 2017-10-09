package Java_Inleiding.Hoofdstuk11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    int invoer = 0;

    public void init() {
        this.setSize(350,130);
        tekstvak = new TextField("", 5);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        knop2 = new Button("Volgende tafel");
        knop2.addActionListener( new KnopListener2() );


        add(tekstvak);
        add(knop);
        add(knop2);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;


        if (invoer >0){
            while(teller <= 10) {

                g.drawString(""+ teller + "x" + invoer + "=" + (teller*invoer),70,y);

                y += 20;
                teller++;
            }
        }
        tekstvak.setText("");
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            invoer = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }

    class KnopListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            invoer = invoer+1;
            repaint();
        }
    }
}