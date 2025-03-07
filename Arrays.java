import java.util.*; 
class Arrays
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int [] rollno = new int[20]; 
		String[] name = new String[20]; 
		float[] cgpa = new float[20]; 
		

		System.out.println("Enter No. of Student's Data You Want To Store:"); 
		int n = sc.nextInt();  
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Roll No :"); 
			rollno[i] = sc.nextInt(); 
			System.out.println("Enter Name :"); 
			name[i] = sc.next(); 
			System.out.println("Enter CGPA :"); 
			cgpa[i] = sc.nextFloat();
		}
		System.out.println("---------Student Details--------------"); 
		System.out.println("Roll No"+"\t"+"Name"+"\t"+"CGPA"); 
		for(int i=0;i<n;i++)
		{
			System.out.println(rollno[i]+"\t"+name[i]+"\t"+cgpa[i]);
			
		}
		
		
				

	}
}
