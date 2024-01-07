package projects;
import java.math.*;
import java.util.Scanner;
/*----------------------------------------------    TASK NO.1     ---------------------------------------------------------------*/
public class NumberGame {
	static int count=0;
	
	public static void main(String[] args) {
		
		double d = (Math.random()*100)+1;
		int no=(int)d;
		boolean choice;
		System.out.println(" Welcome to Number Guessing game\n you can guess from 1 to 100 but\n you have to guess in 10 attempts\n");
		
		do {
		System.out.println("*********************************************************");
		System.out.println("Enter a number ");
		functionforNoGuess(no);
		System.out.println("For PLAYING AGAIN type true for EXIT type false ");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextBoolean();
		}while(choice);
		
		System.out.println("you attempted "+count+" times");
		}
		

	static void functionforNoGuess(int no)
	{
		++count;
		Scanner sc=new Scanner(System.in);
		int gNo=0;
		for(int i=0;i<10;i++)
		{
			gNo=sc.nextInt();
			
			 if(i==9 && (no<gNo || no>gNo)) {
				 System.out.println("Game Over!");
					break;
			 }
			else if(no>gNo)
				System.out.println("Your guess is very low");
			else if(no<gNo)
				System.out.println("Your guess is very high");
			else 
				break;
		}
		if(no==gNo)
			System.out.println("Congratulations you WON\n");
		else
			System.out.println("You LOST\n");
	
	}
	
}
