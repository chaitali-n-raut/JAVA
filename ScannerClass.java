import java.util.Scanner; 
class ScannerClass
{
	public static void main(String args[])
	{
		int rollno; 
		String name, prn; 
		double cgpa, fees; 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Your Roll No :"); 
		rollno = sc.nextInt(); 
		System.out.println("Enter PRN No :"); 
		prn = sc.next(); 
		System.out.println("Enter Your Name :"); 
		name = sc.next(); 
		System.out.println("Enter Your CGPA :"); 
		cgpa = sc.nextDouble(); 
		System.out.println("Enter Your Fees :"); 
		fees = sc.nextDouble(); 
		
		System.out.println("-------------Student Info-------------"); 
		System.out.println("Roll No = "+rollno+"\n"+"PRN No ="+prn+"\n"+"Name = "+name+"\n"+"CGPA = "+cgpa+"\n"+"Fees="+fees); 
	}
}
