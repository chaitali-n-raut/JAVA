import java.util.*; 
class InitializedArray
{
	public static void main(String args[])
	{		
		 
		int [] rollno = {1,2,3,4,5}; 
		String[] name = {"CR","DM","VP","SH","SD"};
		float [] cgpa = {8.91f, 7.86f, 8.77f, 8.68f, 8.36f};
		
		System.out.println("----------Student Data-------------"); 
		System.out.println("RollNo "+"\t"+"Name"+"\t"+"CGPA"); 
		for (int i=0;i<5;i++)
		{
			System.out.println(rollno[i]+"\t"+name[i]+"\t"+cgpa[i]); 

		}
	}
}
