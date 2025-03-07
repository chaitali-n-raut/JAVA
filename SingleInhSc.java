import java.util.*; 
 class Super
{
	
	Scanner sc = new Scanner(System.in); 

	int a = sc.nextInt(); 
	int b = sc.nextInt(); 
	 
}
class Derived extends Super
{
	void Addition()
	{
		int c = a + b; 
		System.out.println("Addtion = "+c); 
	}
}
class SingleInhSc 
{
	public static void main(String args[])
	{
		System.out.println("Enter 2 No :"); 
		Derived d = new Derived(); 
		
		d.Addition();
	}
	
}
