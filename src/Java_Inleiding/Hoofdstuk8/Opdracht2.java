package Java_Inleiding.Hoofdstuk8;
//Made by the Legend Known as Najdere the Great
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
    int AMan;
    int AVrouw;
    int PMan;
    int PVrouw;
    Button knopAM;
    Button knopAV;
    Button knopPM;
    Button knopPV;


    public void init() {
        this.setSize(new Dimension(400,200));

        AMan = 0;
        AVrouw = 0;
        PMan = 0;
        PVrouw = 0;

        knopAM = new Button("Man");
        knopAM.addActionListener( new KnopListenerAM() );
        knopAV = new Button("Vrouw");
        knopAV.addActionListener( new KnopListenerAV() );
        knopPM = new Button("Potentiële vrouw");
        knopPM.addActionListener( new KnopListenerPM() );
        knopPV = new Button("Potentiële man");
        knopPV.addActionListener( new KnopListenerPV() );

        add(knopAM);
        add(knopAV);
        add(knopPM);
        add(knopPV);

        repaint();


    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen: " + AMan, 20, 60 );
        g.drawString("Aantal vrouwen: " + AVrouw, 20, 80 );
        g.drawString("Potentiële mannen: " + PMan, 20, 100 );
        g.drawString("Potentiële vrouwen: " + PVrouw, 20, 120 );
    }

    class KnopListenerAM implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            AMan++;
            repaint();
        }
    }

    class KnopListenerAV implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            AVrouw++;
            repaint();
        }
    }
    class KnopListenerPM implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PMan++;
            repaint();
        }
    }

    class KnopListenerPV implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PVrouw++;
            repaint();
        }
    }

}
