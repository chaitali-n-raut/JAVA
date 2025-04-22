//import java.applet.*; 
import javax.swing.*; 
import java.awt.*; 
class SwingEx1 extends JFrame
{
	public static void main(String args[])
	{

		
	
		JFrame f = new JFrame("Login"); 
				//Width, Height
		f.setSize(500, 500);		
		f.setLayout(null); 
	 
	 	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		JLabel l1 = new JLabel("UserName :");
		l1.setBounds(50, 50, 100, 30); 
		 
		JTextField t1 = new JTextField(); 
		t1.setBounds(150, 50, 200, 30);
		
		JLabel l2 = new JLabel("Password :"); 
		l2.setBounds(50, 80, 110, 30);
		
		JTextField t2 = new JTextField(); 
		t2.setBounds(150, 80, 200, 30);  
		
		JButton b = new JButton (" Submit "); 
		b.setBounds(150, 160, 150, 70); 
					//x, y, width, height		
		
		f.setVisible(true); 
		
		f.add(l1); 
		f.add(t1); 
		f.add(l2); 
		f.add(t2); 
		f.add(b); 
	}
}
