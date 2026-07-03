import java.io.*;
import java.net.*;

public class EchoServer {
    private static final int PORT = 9999;
    
    public static void main(String[] args) {
        System.out.println("Starting echo server on port " + PORT);
        
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Echo server is listening on port " + PORT);
            
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());
            
            // Create DataInputStream to read from client
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            
            // Create DataOutputStream to send response
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            
            // Read one line from client using readUTF
            String message = in.readUTF();
            
            System.out.println("Received: " + message);
            
            // Echo the message back using writeUTF
            out.writeUTF("Echo: " + message);
            System.out.println("Sent echo back to client");
            
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
            
            System.out.println("Connection closed");
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}