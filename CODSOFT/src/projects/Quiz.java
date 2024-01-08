package projects;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*-----------------------------------------      TASK NO. 4       ------------------------------------------------------------------*/
public class Quiz 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/questions","root","Root@123");
		//System.out.println("database connected");
		Statement st=con.createStatement();
		String q1="select * from mcq order by rand()";//query for random questions
		ResultSet rs=st.executeQuery(q1);
		int count=0;
		char ch;//char to collect user enter value
		System.out.println("There are 10 questions and you have only"+"\n 15 seconds to answer each question\n");
		
			while(rs.next())//loop for resultset 
			{
					System.out.println("--------------------------------------------------\n");
					System.out.println("Q."+rs.getString("qts")+"\n a."+rs.getString("a")+
					"\n b."+rs.getString("b")+"\n c."+rs.getString("c")+"\n d."+rs.getString("d")+"\n");
					
					System.out.println("Enter the correct answer");
					ch=counter();
					if(ch==(rs.getString("crt").charAt(0)) )
						++count;
			}
		System.out.println("you have got only "+count);
		con.close();
		rs.close();
	}		
	
	public static char counter()
	{
		int i;
		char ch=' ';
		for(i=14;i>=0;i--)//counter for timer
		{
			System.out.print(i+" ");
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
		}
		System.out.println("\n");//new line
		ch=sc.next().charAt(0);//answer taken by user
		if(i==-1 && ch==' ')
		return ' ' ;
		return ch;
	}
	
}
