import java.io.IOException; 
class ThrowsKeyword
{
	public static void main(String args[])
	{
		ThrowsKeyword t = new ThrowsKeyword(); 
		t.P(); 
		
		System.out.println("Executed "); 
	}
	
	void M() throws IOException
	{
		throw new IOException("Device Error"); // Checked Exception
	}
	void N() throws IOException
	{
		M(); 
	}
	void P()
	{
		try
		{
			M(); 
			N(); 
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"); 
		}
	}
}
