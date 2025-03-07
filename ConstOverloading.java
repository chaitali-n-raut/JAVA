class ConstOverloading
{
	int i, r; 
	String n; 
	ConstOverloading(int id, String name)
	{
		i = id; 
		n = name; 
		System.out.println("Constructor with 2 Parameters "); 
		System.out.println("Id = "+i); 
		System.out.println("Name = "+n); 
	}
	ConstOverloading(int id, String name, int rollno)
	{
		i = id; 
		n = name; 
		r = rollno; 
		System.out.println("Constructor with 3 Parameters "); 
		System.out.println("Id = "+i); 
		System.out.println("Name = "+n); 
		System.out.println("Roll No = "+r); 
	}
	
	public static void main(String args[])
	{
		ConstOverloading p = new ConstOverloading(1, "Chaitali");

		ConstOverloading q = new ConstOverloading(2, "Dipali", 152); 
		
		ConstOverloading c = new ConstOverloading(3, "Vaishnavi", 139); 

	}
}
