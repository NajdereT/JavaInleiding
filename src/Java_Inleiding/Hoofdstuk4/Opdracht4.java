package Java_Inleiding.Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init () {


    }

    public void paint (Graphics g) {
        g.drawLine(80,40,80,240);
        g.drawLine(80,240,280,240);

        g.drawLine(80,200,70,200);
        g.drawString("20kg",30,205);

        g.drawLine(80,160,70,160);
        g.drawString("40kg",30,165);

        g.drawLine(80,120,70,120);
        g.drawString("60kg",30,125);

        g.drawLine(80,80,70,80);
        g.drawString("80kg",30,85);

        g.drawLine(80,40,70,40);
        g.drawString("100kg",30,45);

        g.setColor(Color.pink);
        g.fillRect(100,160,30,80);
        g.drawString("Valerie",93,270);

        g.setColor(Color.blue);
        g.fillRect(160,40,30,200);
        g.drawString("Jeroen",155,270);

        g.setColor(Color.green);
        g.fillRect(220,80,30,160);
        g.drawString("Hans",217,270);

    }


}
