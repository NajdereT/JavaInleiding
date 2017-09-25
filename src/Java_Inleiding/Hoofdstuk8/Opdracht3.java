package Java_Inleiding.Hoofdstuk8;
//*bij mij"Najdère
//deze was wel wat moeijlijker
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Opdracht3 extends Applet {
    double bedraga;
    double bedragb;
    TextField tekstvak;
    Label label;
    Button knop;


    public void init() {
        this.setSize(new Dimension(350,150));
        tekstvak = new TextField("",20);
        label = new Label("Bedrag exc. BTW: ");
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        if (bedragb > 0) {
            g.drawString("Bedrag inc. BTW: " + formatter.format(bedragb), 50, 60 );
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bedraga = Integer.parseInt(tekstvak.getText());
            bedragb = bedraga * 1.21;
            repaint();
        }
    }
}