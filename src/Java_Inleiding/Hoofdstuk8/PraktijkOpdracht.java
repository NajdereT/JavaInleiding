package Java_Inleiding.Hoofdstuk8;
//Najdere
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    TextField TekstvakA;
    TextField TekstvakB;
    Double GetalA;
    Double GetalB;
    String Antwoord;
    Button KnopKeer;
    Button KnopDeel;
    Button KnopPlus;
    Button KnopMin;
    public void init() {
        this.setSize(new Dimension(400,100));
        TekstvakA = new TextField("",5);
        TekstvakB = new TextField("",5);
        KnopKeer = new Button("*");
        KnopKeer.addActionListener( new KnopKeer() );
        KnopDeel = new Button("/");
        KnopDeel.addActionListener( new KnopDeel() );
        KnopPlus = new Button("+");
        KnopPlus.addActionListener( new KnopPlus() );
        KnopMin = new Button("-");
        KnopMin.addActionListener( new KnopMin() );
        add(TekstvakA);
        add(TekstvakB);
        add(KnopKeer);
        add(KnopDeel);
        add(KnopPlus);
        add(KnopMin);
    }
    public void paint(Graphics g) {
       g.setColor(Color.blue);

    }
    class KnopKeer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GetalA = Double.parseDouble(TekstvakA.getText());
            GetalB = Double.parseDouble(TekstvakB.getText());
            Antwoord = String.valueOf(GetalA*GetalB);
            TekstvakA.setText(Antwoord);
            TekstvakB.setText("");
        }
    }
    class KnopDeel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GetalA = Double.parseDouble(TekstvakA.getText());
            GetalB = Double.parseDouble(TekstvakB.getText());
            Antwoord = String.valueOf(GetalA/GetalB);
            TekstvakA.setText(Antwoord);
            TekstvakB.setText("");
        }
    }
    class KnopPlus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GetalA = Double.parseDouble(TekstvakA.getText());
            GetalB = Double.parseDouble(TekstvakB.getText());
            Antwoord = String.valueOf(GetalA+GetalB);
            TekstvakA.setText(Antwoord);
            TekstvakB.setText("");
        }
    }
    class KnopMin implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GetalA = Double.parseDouble(TekstvakA.getText());
            GetalB = Double.parseDouble(TekstvakB.getText());
            Antwoord = String.valueOf(GetalA-GetalB);
            TekstvakA.setText(Antwoord);
            TekstvakB.setText("");
        }
    }
}