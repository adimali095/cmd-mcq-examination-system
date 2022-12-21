import java.util.Scanner;
import java.util.ArrayList;
public class ServerInput
{
	public static void main(String args[])
	{
		//MCQ mcq = new MCQ();
		//mcq.display(); (tested this code)
		
		/*
		MCQBundle mcqb = new MCQBundle();
		mcqb.inputLength();
		mcqb.inputQuestions();
		mcqb.displayQuestions();  //same code initialize method mde ahe
		mcqb.closeScanner();
		*/
		
		/*
		MCQBundle mcqb = MCQBundle.getMCQBundle();
		ServerManager server;
		for(int port = 2021; port < 2023 ; port++ )
		{
		    server = new ServerManager(port);
		    System.out.println("\nSending object to client No [ "+(port-2020)+" ]...");
			server.sendObjectToClient(mcqb);
			System.out.println("\nPackages Sent\n");
		}
		*/
		ServerInput si = new ServerInput();
		si.cmdLine();
	}
	void cmdLine()
	{
		MCQBundle mcqb = MCQBundle.getMCQBundle();
		ServerManager server;
		for(int port = 2021; port < 2023 ; port++ )
		{
		    server = new ServerManager(port);
		    System.out.println("\nSending object to client No [ "+(port-2020)+" ]...");
			server.sendObjectToClient(mcqb);
			System.out.println("\nPackages Sent\n");
		}
	}
	void gui()
	{
		a
	}
}
