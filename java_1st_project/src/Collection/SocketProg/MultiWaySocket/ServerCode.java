package Collection.SocketProg.MultiWaySocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerCode {
    public static void main(String[] args) throws Exception {
        // Create a ServerSocket to listen for connections
        ServerSocket listener = new ServerSocket(4000);
        System.out.println("Server is ready and waiting for a client...");
        Socket ssoc = listener.accept();
        System.out.println("Client connected!");

        // Set up input and output streams
        InputStream is = ssoc.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = ssoc.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);

        // Limit the conversation to 3 exchanges
        int iterations = 5;
        for (int i = 1; i <= iterations; i++) {
            // Server receives a message from the client
            String message = dis.readUTF();
            System.out.println("Client: " + message);

            // Server responds to the client
            System.out.print("Server: Enter your response (" + i + "/" + iterations + "): ");
            String response = sc.nextLine();
            dos.writeUTF(response);
        }

        // Close the connections after the conversation ends
        System.out.println("Conversation ended. Closing connection.");
        ssoc.close();
        listener.close();
        sc.close();
    }
}
