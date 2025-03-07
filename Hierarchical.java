class A
{
	int a = 30, b = 10; 
}
class B extends A 
{
	void Add()
	{
		System.out.println("Addition = "+(a+b)); 
	}
}
class C extends A 
{
	void Sub()
	{
		System.out.println("Subtraction = "+(a-b)); 
	}
}
class D extends A 
{
	void Mul()
	{
		System.out.println("Multiplication = "+(a*b)); 
	}
}
class E extends A 
{
	void Div()
	{
		System.out.println("Division = "+(a/b)); 
	}
}
class Hierarchical
{
	public static void main(String args[])
	{
		B b1 = new B(); 
		b1.Add(); 
		C c1 = new C(); 
		c1.Sub(); 
		D d1 = new D(); 
		d1.Mul(); 
		E e1 = new E(); 
		e1.Div(); 
	}
}

