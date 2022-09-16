package Session6.logIn;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2810);
            while (true)
            {
                Socket client = server.accept();

                ObjectInputStream inFromClient = new ObjectInputStream(client.getInputStream());
                String c = (String) inFromClient.readObject();
                if (!c.equals("connect"))
                {
                    System.out.println("Disconnected");
                    client.close();
                }
                System.out.println("Username?");
                inFromClient = new ObjectInputStream(client.getInputStream());
                String u = (String) inFromClient.readObject();

                System.out.println("Password?");
                inFromClient = new ObjectInputStream(client.getInputStream());
                String p = (String) inFromClient.readObject();

                System.out.println("Approved");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
