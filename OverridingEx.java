class Base 
{
	void Display(int rollno, String name)
	{
		System.out.println("---------Base Class---------- "); 
		int r = rollno; 
		String n = name; 
		System.out.println("Roll NO = "+r); 
		System.out.println("Name = "+n); 
	}
}
class Derived extends Base
{
	void Display(int rollno, String name)
	{
		super.Display(152, "Dipali"); 
		System.out.println("-----------Derived Class--------- "); 
		int r = rollno; 
		String n = name; 
		System.out.println("Roll No = "+r); 
		System.out.println("Name = "+n); 
	}
}
class OverridingEx 
{
	public static void main(String args[])
	{
		Derived d = new Derived(); 
		d.Display(149, "Chaitali"); 
	}
}
