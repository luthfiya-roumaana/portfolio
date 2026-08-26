// ---------- Server.java ---------- 
import java.io.*; 
import java.net.*; 
 
public class Server { 
    public static void main(String[] args) { 
        try { 
            ServerSocket serverSocket = new ServerSocket(5000); 
            System.out.println("Server started. Waiting for client..."); 
 
            Socket socket = serverSocket.accept(); 
            System.out.println("Client connected!"); 
 
            BufferedReader in = new BufferedReader( 
                    new InputStreamReader(socket.getInputStream())); 
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
 
            String clientMessage = in.readLine(); 
            System.out.println("Message from client: " + clientMessage); 
 
            out.println("Hello Client, message received: " + clientMessage); 								
 
            socket.close(); 
            serverSocket.close(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
 
// ---------- Client.java ---------- 
import java.io.*; 
import java.net.*; 
 
public class Client { 
    public static void main(String[] args) { 
        try { 
            Socket socket = new Socket("localhost", 5000); 
 
            BufferedReader in = new BufferedReader( 
                    new InputStreamReader(socket.getInputStream())); 
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
 
            out.println("Hello Server, this is the client!"); 
 
            String serverResponse = in.readLine(); 
            System.out.println("Message from server: " + serverResponse); 
 
            socket.close(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
}