import java.io.*;
import java.net.*;
public class ClientManager 
{
    private String server;
    private int port;
	
	private Object obj;
	
	private ObjectInputStream inputStream = null;

    //Streams für Serialisierte Objekte
    private ObjectInputStream inputObjectStream = null; 
    private ObjectOutputStream outputObjectStream = null; 

    //Konstruktor: Server und Port werden benötigt
    public ClientManager(String server,int port){
        this.server = server;
        this.port = port;
    }

    //Sendet ein Object an eine Serverinstanz
    public void sendObjectToServer(Object obj)
	{
        try(Socket socket = new Socket(server,port))
		{

            //this line
			outputObjectStream = new ObjectOutputStream(socket.getOutputStream());
            outputObjectStream.writeObject(obj);

            outputObjectStream.flush();
            outputObjectStream.close();
			//this line

        } 
		catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Bekommt ein Object von einer Serverinstanz 
    public Object getObjectFromServer()
	{
		try(Socket socket = new Socket(server,port))
		{

            //this line
			/*
			outputObjectStream = new ObjectOutputStream(socket.getOutputStream());
            outputObjectStream.writeObject(obj);

            outputObjectStream.flush();
            outputObjectStream.close();
			*/
			inputStream = new ObjectInputStream(socket.getInputStream());
            obj = inputStream.readObject();
			//this line

        } 
		catch (Exception ex) {
            ex.printStackTrace();
        }
		return obj;
    }
}