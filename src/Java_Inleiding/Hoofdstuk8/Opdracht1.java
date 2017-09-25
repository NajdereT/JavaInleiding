package Java_Inleiding.Hoofdstuk8;
//made by the Great Najdere
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop1;
    Button knop2;


    public void init() {
        this.setSize(new Dimension(500,200));
        tekstvak = new TextField("",20);
        label = new Label("Typ iets in het tekstvakje");
        knop1 = new Button("Ok");
        knop1.addActionListener( new KnopListenery() );
        knop2 = new Button("RESET");
        knop2.addActionListener( new KnopListenern() );
        add(label);
        add(tekstvak);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {

        g.drawString(tekstvak.getText(), 50, 60 );
    }

    class KnopListenery implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
    class KnopListenern implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}