class CopyConst
{
	int rollno; 
	String name; 
	CopyConst(int r, String n)
	{
		rollno = r; 
		name = n ; 
		System.out.println("Roll No = "+rollno); 
		System.out.println("Name ="+name);  	
	}
	CopyConst(CopyConst c)
	{	
		rollno = c.rollno; 
		name = c.name;
		System.out.println("Copied From c1 Object "); 
		System.out.println("Roll No = "+rollno); 
		System.out.println("Name ="+name);  	
	}
	
	
	public static void main(String args[])
	{	
		CopyConst c1 = new CopyConst(149, "Chaitali"); 
		CopyConst c2 = new CopyConst(c1); 
	}
}
