import java.util.*; 
class Base
{
	 void Accept()
	{
		System.out.println("Function of Base Class"); 
	}
}
class Derived extends Base
{
	void Accept(int n)
	{
		System.out.println("Value of n in Derived Class = "+n);
	}
}
class FunOverload
{
	public static void main(String args[])
	{
		Derived d = new Derived(); 
		d.Accept(); 
		d.Accept(5);
	}
	
}
