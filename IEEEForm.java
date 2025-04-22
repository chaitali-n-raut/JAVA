import javax.swing.*; 
class IEEEForm extends JFrame 
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("IEEE Registration Form"); 
		f.setSize(500, 500); 
		f.setLayout(null); 
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		JLabel l1 = new JLabel("Full Name :"); 
		l1.setBounds(50, 50, 100, 30); 
		JTextField t1 = new JTextField(); 
		t1.setBounds(170, 50, 200, 30); 
		
		JLabel l2 = new JLabel("College :"); 
		l2.setBounds(50, 90, 100, 30); 
		JTextField t2 = new JTextField(); 
		t2.setBounds(170, 90, 200, 30); 
		
		JLabel l3 = new JLabel("Department :"); 
		l3.setBounds(50, 130, 100, 30); 
		JTextField t3 = new JTextField(); 
		t3.setBounds(170, 130, 200, 30); 
		
		JButton b1 = new JButton("Clear "); 
		b1.setBounds(70, 170, 100, 40); 
		
		JButton b2 = new JButton("Submit"); 
		b2.setBounds(220, 170, 100, 40); 
		
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
