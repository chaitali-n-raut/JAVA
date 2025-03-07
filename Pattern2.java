/*class Pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++) //rows
		{
			for(int j=5;j>=i;j--) //column
			{
				System.out.print(" * "); 
			}
			System.out.println(); 
		}
	}
}*/
/*class Pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++) //rows
		{
			for(int j=1;j<=i;j++) //column
			{
				System.out.print(" * "); 
				
			}
			System.out.println(); 
		}
	}
}*/
class Pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++) //rows
		{
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" "); 
			}
			for(int j=1;j<=i;j++) //column
			{
				System.out.print(" * "); 
				
			}
			System.out.println(); 
		}
	}
}
