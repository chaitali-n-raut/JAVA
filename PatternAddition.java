
class PatternAddition
{
	public static void main(String args[])
	{
		int a = 3, b = 4, add; 
		
		for(int i=1;i<=5;i++) //1 //2 //3
		{
			add = a + b; //7  //12  //18 
			System.out.println(a+" "+b+" "+add); //3 + 4 = 7 
							   // 7 + 5 = 12
			a = add; //a=7  //a=12
			b++; //b=5  //b=6
		}
	}
}
/* cmd /

asdfa
