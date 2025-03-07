class A
{
	void Show()
	{
		System.out.println("Method of class-A (Base)"); 
	}
}
class B extends A
{
	 
	void Show()
	{
		super.Show();
		System.out.println("Method of class-B (Derived)"); 
	}
}
class Overriding 
{
	public static void main(String args[])
	{
		B b1 = new B(); 
		b1.Show(); 
	}
}
