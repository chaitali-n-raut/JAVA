interface printable
{
	void Print(); 
}
class InterfaceEx implements printable
{
	public void Print()
	{
		System.out.println("Print Method Of Class");
	}
	public static void main(String args[])
	{
		InterfaceEx e = new InterfaceEx(); 
		e.Print(); 
	}
}
