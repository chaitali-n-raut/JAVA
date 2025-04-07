
class ThrowKeyword
{
	public static void main(String args[])
	{
		ThrowKeyword t = new ThrowKeyword(); 
		t.CheckAccess(19); 
		t.CheckAccess(15); 
	}
	void CheckAccess(int Age)
	{
		if(Age < 18 )
		{
			throw new ArithmeticException("Access Denied!Not Enough Age!"); 
		}
		else
		{
			System.out.println("****Access Granted****"); 
		}
	}
}
