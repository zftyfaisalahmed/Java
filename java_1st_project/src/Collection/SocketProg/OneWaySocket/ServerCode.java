package Collection.SocketProg.OneWaySocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerCode {
    public static void main(String[] args) throws Exception {
        ServerSocket listener = new ServerSocket(4000);
        System.out.println("Server is ready");
        Socket ssoc = listener.accept();
        InputStream is = ssoc.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String message = dis.readUTF();
        System.out.println(message);
    }
}
