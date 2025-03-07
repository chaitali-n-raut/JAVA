class ParameterConst
{
	int i, r; 
	String n; 
	ParameterConst(int id, String name)
	{
		i = id; 
		n = name; 
		System.out.println("Constructor with 2 Parameters "); 
	}
	
	void Display()
	{
		System.out.println("Id = "+i); 
		System.out.println("Name = "+n); 
	}
	public static void main(String args[])
	{
		ParameterConst p = new ParameterConst(1, "Chaitali");
		p.Display();
		 
		 
	}
}
