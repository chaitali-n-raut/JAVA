interface A
{
	 void MethodA(); 
}
interface B
{
	 void MethodB(); 
}
class C implements A, B
{
	public void MethodA()
	{
		System.out.println("Interface A Method "); 
	}
	public void MethodB()
	{
		System.out.println("Interface B Method "); 
	}
}
class MultipleInh 
{
	public static void main(String args[])
	{
		C c = new C(); 
		c.MethodA(); 
		c.MethodB();  
	}
	
}
