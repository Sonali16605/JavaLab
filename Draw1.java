
import java.awt.*;
import java.awt.event.*;
public class Draw1 extends Frame {
	Draw1()
	{
		//closin te Frame
		this.addWindowListener((WindowListener) new WindowListener() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
// to refresh te Frame contens
public void paint(Graphics g)
{
	g.setColor(Color.red);
        g.fillRect(40,40,200,200);
	g.drawRect(40,40,200,200);
        g.setColor(Color.blue);
	g.drawOval(90,70,80,80);
	g.drawOval(110,95,5,5);
	g.drawOval(145,95,5,5);
	g.drawLine(130,95,130,115);
	g.drawArc(113,115,35,20,0,-180);
}

	public static void main(String[] args) {
		Draw1 d =new Draw1();
		
		d.setSize(400,400);
		d.setTitle("Drawing");
		d.setVisible(true);

	}

}
