package Collection.SocketProg.TwoWaySocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) throws Exception {
        String localhost = "192.168.97.120";
        Socket csoc = new Socket(localhost, 4000);
        OutputStream os = csoc.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message");
        String message = sc.nextLine();
        dos.writeUTF(message);
        InputStream is = csoc.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String response = dis.readUTF();
        System.out.println(response);
    }
}
