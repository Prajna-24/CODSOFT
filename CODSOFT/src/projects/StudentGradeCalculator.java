package projects;
import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter marks of all subject to find sum,percentage and grade");
		int []arr=new int[5]; 
		
		for(int i=0;i<5;i++)	//we are taking marks from user and add in sum variable
		{
			arr[i]=sc.nextInt();
			if(arr[i]>100 || arr[i]<0)
			{
				System.out.println("Enter valid marks");
				arr[i]=sc.nextInt();
			}
			sum+=arr[i];
		}
		System.out.println("total marks obtained: "+sum); //total sum of all marks
		
		int per=sum/5;						//percentage 
		System.out.println("percentage : "+per+"%");
		
		if(per>85 && per<=100)			//grades according to percentage
			System.out.println("Grade A");

		else if(per>70 && per<=85)		
			System.out.println("Grade B");

		else if(per>65 && per<=70)
			System.out.println("Grade C");

		else if(per>55 && per<=65)
			System.out.println("Grade C");
	
		else if(per>40 && per<=55)
			System.out.println("Grade D");
		
		else if(per<40)
			System.out.println("Grade E");
	}
}
