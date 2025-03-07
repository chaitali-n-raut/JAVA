abstract class Base
{
	abstract void Print();  
}
class AbstractClass extends Base
{
	public void Print()
	{
		System.out.println("Abstractiion Achieved"); 
	}
	public static void main(String args[])
	{
		AbstractClass a = new AbstractClass(); 
		a.Print(); 
	}
}
