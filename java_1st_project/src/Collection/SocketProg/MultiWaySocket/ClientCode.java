package Collection.SocketProg.MultiWaySocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) throws Exception {
        String localhost = "192.168.97.120"; // Replace with your server's IP address
        Socket csoc = new Socket(localhost, 4000);

        OutputStream os = csoc.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        InputStream is = csoc.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        Scanner sc = new Scanner(System.in);

        System.out.println("Connected to the server.");
        int iterations = 5; // Limit the conversation to 3 exchanges

        for (int i = 1; i <= iterations; i++) {
            // Client sends a message
            System.out.print("Client: Enter your message (" + i + "/" + iterations + "): ");
            String message = sc.nextLine();
            dos.writeUTF(message);

            // Client receives a response
            String response = dis.readUTF();
            System.out.println("Server: " + response);
        }

        System.out.println("Conversation ended. Closing connection.");
        csoc.close();
        sc.close();
    }
}
