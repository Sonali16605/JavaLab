import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class jtable extends JFrame{
	
	JTable j;
	jtable()
	{
		setTitle("JTable Example");
        String[][] d= {
			{ "Rohan Ratore", "BTCs09", "CSE" },
			{ "Sonali soni", "BTIT5411", "IT" },
			{ "Soumya Sharma", "BTCS01", "CS" }
		};
        String[] c= { "Name", "Enrollment", "Department" };
        j = new JTable(d,c);
		j.setBounds(100,100,200,300);
        JScrollPane sp = new JScrollPane(j);
		add(sp);
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new jtable();
	}
}
