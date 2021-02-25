
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class House extends Frame {

	House(){
        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
    public void paint(Graphics g)
    {
        g.setColor(Color.cyan);
        g.drawRect(260,280,790,380);
        g.setColor(Color.yellow);
        g.drawLine(260,280,370,180);
        g.drawLine(370,180,470,280);
        g.drawLine(370,180,1050,180);
        g.drawLine(1050,180,1050,280);
        g.drawLine(470,280,470,660);
        g.drawRect(550,510,90,150);


    }

    public static void main(String[] args) {
    	House h=new House();
        h.setSize(1920,1900);
        h.setVisible(true);
        h.addWindowListener(new NewClass());

    }
}