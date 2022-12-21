import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
public class MCQ implements Serializable
{
	String que;
	String[] opt = new String[4];
	int correctAnswerIndex;
	int inputedAnswerIndex;
	
	static Scanner sc = new Scanner(System.in);
	void closeScanner()  
	{  
		sc.close();
	}	
	
	void input()
	{
		int i,temp=0;

		System.out.print("Enter question : ");
		que = sc.nextLine();
		System.out.print("\nEnter options below\n");
		for(i = 0 ; i < 4 ; i++)
		{
			System.out.print("Option [ "+ (i+1) +" ] : ");
			opt[i] = sc.nextLine();
		}
		System.out.print("\nEnter correct answer index : ");
		do
		{
			correctAnswerIndex = sc.nextInt(); 
			temp = correctAnswerIndex;
			System.out.println("temp : "+temp);
			if( ( temp > 4 ) || ( temp < 1 ) )
			{
				System.out.print("\nThe vaule should be from 1 to 4\nEnter again : ");
			}
		} while( ( temp > 4 ) || ( temp < 1 ) );
		
		sc.nextLine();
	}
	void display()
	{
		int i; 
		System.out.println("\nQuestion : "+que);
		System.out.println("\nOptions : ");
		for(i = 0 ; i < 4 ; i++)
		{
			System.out.println("Option [ "+ (i+1) +" ] : " + opt[i]);
		}
		
		System.out.println("\ncorrectAnswerIndex : "+ ( correctAnswerIndex+1 ));
		// index should be one less than input index as its an array
		
	}
	void inputAnswer()
	{
		int i,temp; 
		System.out.println("\nQuestion : "+que);
		System.out.println("\nOptions : ");
		for(i = 0 ; i < 4 ; i++)
		{
			System.out.println("Option [ "+ (i+1) +" ] : " + opt[i]);
		}
		
		System.out.print("\nYour answer : ");
		do
		{
			inputedAnswerIndex = sc.nextInt(); 
			temp = inputedAnswerIndex;
			if( ( temp > 4 ) || ( temp < 1 ) )
			{
				System.out.print("\nThe vaule should be from 1 to 4\nEnter again : ");
			}
		} while( ( temp > 4 ) || ( temp < 1 ) );
		sc.nextLine();
		// index should be one less than input index as its an array
		
	}
}