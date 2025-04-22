import java.awt.*; 
import javax.swing.*; 
class GridForm extends JFrame
{
	public static void main(String args [])
	{
		JFrame f = new JFrame("IEEE Login Form "); 
		f.setSize(500, 500); 
						//(rows, column, H Gap, V Grap)
		f.setLayout(new GridLayout(4, 2, 30, 50));   
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		JLabel l1 = new JLabel("Full Name :"); 
		JTextField t1 = new JTextField(); 
		
		JLabel l2 = new JLabel("College :"); 
		JTextField t2 = new JTextField(); 
		
		JLabel l3 = new JLabel("Department :"); 
		JTextField t3 = new JTextField(); 
		
		JButton b1 = new JButton("Clear ");
		JButton b2 = new JButton("Submit"); 
		
		f.add(l1); 
		f.add(t1); 
		f.add(l2); 
		f.add(t2); 
		f.add(l3); 
		f.add(t3); 
		f.add(b1);
		f.add(b2); 
		
		f.setVisible(true);  
	}
}
