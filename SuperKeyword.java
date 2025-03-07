import java.util.*; 
class A
{
	int a=20; 
}
class B extends A
{
	void Show()
	{
		int a = 10; 
		System.out.println("Derived Class A = "+a); 
		System.out.println("Base Class A = "+super.a); 
		System.out.println("Addition of Both A's = "+(a + super.a)); 
	}
	
	
}
class SuperKeyword
{
	public static void main(String args[])
	{
		B b1 = new B(); 
		b1.Show(); 
	}
}

