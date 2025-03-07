class A
{
	A()
	{
		System.out.println("Constructor of Class-A"); 
	}
}
class B
{
	B()
	{
		System.out.println("Constructor of Class-B"); 
	}
}
class Constructor 
{
	public static void main(String args[])
	{
		A a1 = new A(); 
		B b1 = new B(); 
	}
}
