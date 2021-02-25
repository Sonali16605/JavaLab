
import java.awt.*;
import java.awt.event.*;
public class Fclose extends Frame
{

	public static void main(String[] args) {
		Fclose c1 = new Fclose();
		
		c1.setSize(400,400);
		c1.setTitle("Drawing");
		c1.setVisible(true);
		c1.addWindowListener(new NewClass());

	}

}
class NewClass implements WindowListener
{
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);// TODO Auto-generated method stub
		
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
}
