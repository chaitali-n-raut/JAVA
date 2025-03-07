
class Base
{	
	int a=10, b=20; 
	
}
 class Derived extends Base
{
	void Display()
	{
		int c = a + b; 
		System.out.println("Addition = "+c); 
	}
	
}
class SingleInh
{
	public static void main(String args[])
	{
		Derived d = new Derived(); 
		d.Display(); 
	}
	
}


