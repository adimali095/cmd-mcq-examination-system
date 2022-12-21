import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
public class MCQBundle implements Serializable
{
	int n;
	ArrayList<MCQ> mcqList;
	static int marks = 0;
	
	static Scanner sc = new Scanner(System.in);
	void closeScanner()  
	{  
		sc.close();
	}
	
	void inputLength()
	{
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. of Questions : ");
		n = sc.nextInt();
		sc.nextLine();
		//sc.close();
	}
	void inputQuestions()
	{
		int i;
		MCQ tempMcqObj;
		mcqList = new ArrayList<MCQ>(n);
		String hypens = "----------------------------------------------";
		
		for( i = 0 ; i < n ; i++)
		{
			System.out.println(hypens+" [ "+(i+1)+" ] "+hypens);
			tempMcqObj = new MCQ();
			tempMcqObj.input();
			/*
			System.out.print("\ntempMcqObj.inputedAnswerIndex = " +tempMcqObj.inputedAnswerIndex);
			System.out.print("\ntempMcqObj.correctAnswerIndex = " +tempMcqObj.correctAnswerIndex+"\n");
			
			if( (tempMcqObj.inputedAnswerIndex) == (tempMcqObj.correctAnswerIndex) )
			{
				marks++;
			}
			*/
			mcqList.add(tempMcqObj);
			System.out.println(hypens+" [ "+(i+1)+" ] "+hypens);
		}
	}
	void displayQuestions()
	{
		int i=0;
		String hypens = "----------------------------------------------";
		for(MCQ  tempMcqObj : mcqList)
		{
			i++;
			System.out.println(hypens+" [ "+i+" ] "+hypens);
			tempMcqObj.display();
			System.out.println(hypens+" [ "+i+" ] "+hypens);
		}
	}
	
	void inputAnswers() // "answers" mde 's' ahe end la
	{
		int i=0;
		String hypens = "----------------------------------------------";
		for(MCQ  tempMcqObj : mcqList)
		{
			i++;
			System.out.println(hypens+" [ "+i+" ] "+hypens);
			tempMcqObj.inputAnswer(); // "answer" 'r' ahe end la 
			
			if( (tempMcqObj.inputedAnswerIndex) == (tempMcqObj.correctAnswerIndex) )
			{
				marks++;
			}
			System.out.println(hypens+" [ "+i+" ] "+hypens);
		}
	}
	
	public static MCQBundle getMCQBundle()
	{
		MCQBundle mcqb = new MCQBundle();
		mcqb.inputLength();
		mcqb.inputQuestions();
		//mcqb.displayQuestions();  //display kraychi grj nahi. only for debugging aheti
		mcqb.closeScanner();
		return mcqb;
	}
	void showMarks()
	{
		System.out.println("\n\nYour marks : "+marks);
	}
	
}


