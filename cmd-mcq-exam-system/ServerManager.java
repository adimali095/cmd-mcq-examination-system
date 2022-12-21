import java.io.*;
import java.net.*;
public class ServerManager 
{
    private final int port; //Portnummer
    private Socket socket = null;
    private ObjectInputStream inputStream = null; //Objekt vom Client
    private ObjectOutputStream outputStream = null; //Objekt an Client

	private ObjectOutputStream outputObjectStream = null; 
    private Object obj; //Objekt das übers Netzwerk gesendet wird

    //Konstruktor
    public ServerManager(int port)
	{
        this.port = port;
    }

    //Bekommt ein Objekt von einem Client
    public Object getObjectFromClient()
	{
        try(ServerSocket serverSocket = new ServerSocket(port)) 
		{
            socket = serverSocket.accept();
            inputStream = new ObjectInputStream(socket.getInputStream());
            obj = inputStream.readObject();
            socket.close();

        }
		catch (Exception e) 
		{
            e.printStackTrace();
        }

        return obj;
    }

    public void sendObjectToClient(Object obj)
	{
        //Muss noch erstellt werden
		try(ServerSocket serverSocket = new ServerSocket(port)) 
		{
            socket = serverSocket.accept();
			
			//this line
        //    inputStream = new ObjectInputStream(socket.getInputStream());
        //    obj = inputStream.readObject();
			//this line 
			
			outputObjectStream = new ObjectOutputStream(socket.getOutputStream());
            outputObjectStream.writeObject(obj);

            outputObjectStream.flush();
            outputObjectStream.close();
            
			socket.close();

        }
		catch (Exception e) 
		{
            e.printStackTrace();
        }
    }

}