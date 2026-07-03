import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient {
    private static final String HOST = "localhost";
    private static final int PORT = 9999;
    
    public static void main(String[] args) {
        System.out.println("Connecting to echo server at " + HOST + ":" + PORT);
        
        try {
            Socket socket = new Socket(HOST, PORT);
            System.out.println("Connected to server!");
            
            // Create DataInputStream to read server response
            DataInputStream in = new DataInputStream(socket.getInputStream());
            
            // Create DataOutputStream to send message
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            
            // Use Scanner to get user input (simpler than BufferedReader!)
            Scanner console = new Scanner(System.in);
            
            System.out.print("Enter message: ");
            String message = console.nextLine();  // Read user input
            
            if (message.length() > 0) {
                // Send message using writeUTF
                out.writeUTF(message);
                System.out.println("Sent: " + message);
                
                // Read echo response using readUTF
                String response = in.readUTF();
                System.out.println("Server echoed: " + response);
            }
            
            console.close();
            in.close();
            out.close();
            socket.close();
            
            System.out.println("Connection closed");
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}