import java.sql.*; 
class DatabaseConn1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/Chaitali149"; 
			String username = "javauser"; 
			String pass = "javapass"; 
			
			Connection c = DriverManager.getConnection(url, username, pass); 
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery("Select * from Student"); 
			System.out.println("Trying To Connect"); 
			
			System.out.println("Roll No  "+"\t"+ "Name "); 
			while(r.next())
			{
				System.out.println(r.getInt("RollNo")+"\t"+r.getString("Name")); 
		
			}
			c.close(); 
			s.close(); 
		}
		catch(Exception e)
		{
			System.out.println("Error!!!"+e.getMessage());
			e.printStackTrace();  
		}
	}
}
