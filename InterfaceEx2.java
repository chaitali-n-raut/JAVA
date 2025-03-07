interface Drawable
{
	void Print(); 
}
class Rectangle implements Drawable
{
	public void Print()
	{
		System.out.println("Rectangle Class"); 
	}
}
class Circle implements Drawable
{
	public void Print()
	{
		System.out.println("Circle Class"); 
	}
}
class InterfaceEx2 
{
	public static void main(String args[])
	{
		Drawable d = new Rectangle(); 
		d.Print(); 
		Drawable dd = new Circle(); 
		dd.Print(); 
	}
}
