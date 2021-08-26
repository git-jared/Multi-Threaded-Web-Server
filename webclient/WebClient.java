// Jared Kremer 1001562181 CSE4344 project 1 
package webclient;
import java.io.* ;
import java.net.* ;
import java.util.* ;



//template for client program
//https://www.javaworld.com/article/2853780/socket-programming-for-scalable-systems.html


/**
 *
 * 
 */
public class WebClient {

    public static void main(String[] args) throws Exception {
        try
        {
        // get port and path
        int port = 8080;
        String Path = "";
        if(args.length == 2)
        {
            port = Integer.parseInt(args[0]);
            Path = args[1];
        }
        else
        {
            port = 8080;
            Path = "/index.html";
        }    
       

        //Get host ip address
        InetAddress host = InetAddress.getLocalHost();

        //Connect to server socket
        Socket socket = new Socket (host, port);

        //Create input and output streams to read from and write to the server
        //DataInputStream is = new DataInputStream(socket.getInputStream());

        OutputStream os = socket.getOutputStream();

        //Wrap the outputstream in a printstream because 
        //we are not writing bits to the server
        PrintStream out = new PrintStream(os);
        BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream()));

        //wrap datainputstream in buffered reader to use readline()
        //BufferedReader in = new BufferedReader(is);

        //follow the HTTP protocol of GET <path> HTTP/1.0 followed by an empty line
        out.println( "GET "+ Path + " HTTP/1.0");
        out.println();

        //Read data from the server until we finish reading the document
        String line = in.readLine();
        while (line != null)
        {
            System.out.print(line);
            line = in.readLine();
        }
        //close streams
        in.close();
        out.close();
        socket.close();
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
}
        
    
    

