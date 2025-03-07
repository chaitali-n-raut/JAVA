import java.util.*; 
class A 
{
	int a=30; 
	void Accept()
	{
		System.out.println("Base Class"); 
	}
}
class B extends A
{	
	int b=10; 
	void Show()
	{
		System.out.println("Derived Class - 1"); 
	}
}
class C extends B
{
	void Display()
	{
		System.out.println("Derived Class - 2"); 
		System.out.println("Addition = "+(a+b));
		System.out.println("Subtraction = "+(a-b)); 
		System.out.println("Multiplication = "+(a*b)); 
		System.out.println("Division = "+(a/b));  
	}
}
class Multilevel
{
	public static void main(String args[])
	{
		C c1 = new C(); 
		c1.Accept(); 
		c1.Show(); 
		c1.Display(); 
	}
}
