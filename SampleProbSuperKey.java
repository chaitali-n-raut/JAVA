class A
{
	void Display()
	{
		System.out.println("Method of A Class"); 
	}
	void Calculate(int a, int b)
	{
		int x = a; 
		int y = b; 
		System.out.println("Addition in SuperClass = "+(x+y)); 
		System.out.println("Calculate Method of A Class"); 
	}
}
class B extends A
{
	void Display()
	{
		super.Display(); 
		System.out.println("Display Method of B Class"); 
		
	}
	void Calculate()
	{
		
		System.out.println("Calculate Method of B Class"); 
		super.Calculate(50, 70); 
	}
	void Addition()
	{
		int a = 20, b=30; 
		System.out.println("Addition = "+(a+b)); 
	}
	
}
class SampleProbSuperKey
{
	public static void main(String args[])
	{
		B b = new B(); 
		b.Display(); 
		b.Addition(); 
		b.Calculate(); 
	}
}

