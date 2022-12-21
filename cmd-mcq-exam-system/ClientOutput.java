import java.util.Scanner;
import java.util.ArrayList;
public class ClientOutput
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter machine no : ");
		int port = sc.nextInt();
		sc.close();
		port = 2020+port;
		ClientManager client = new ClientManager("localhost",port);
		System.out.println("Receiving questions from server...");
		MCQBundle mcqb = (MCQBundle)client.getObjectFromServer();
		System.out.println("Questions Received.\nStarting exams : \n");
		mcqb.inputAnswers();
		mcqb.showMarks();
	}
}
