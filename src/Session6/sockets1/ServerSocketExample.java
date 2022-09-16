package Session6.sockets1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {
    public static void main(String[] args) {
        System.out.println("Starting server....");

        try {
            ServerSocket welcomeServer = new ServerSocket(2910);
            while (true){
                Socket client = welcomeServer.accept();
                System.out.println("Client connected!");

                System.out.println("How can I help?");

                ObjectInputStream inFromClient = new ObjectInputStream(client.getInputStream());
                String o = (String) inFromClient.readObject();
                System.out.println("Received from the client: " + o);

                System.out.println("What word you want to use?");

                inFromClient = new ObjectInputStream(client.getInputStream());
                String w = (String) inFromClient.readObject();
                System.out.println("Received word from client: " + w);

                String answer = "";

                if (o.equals("uppercase"))
                {
                    answer = w.toUpperCase();
                }
                else if (o.equals("lowercase"))
                {
                    answer = w.toLowerCase();
                }

                ObjectOutputStream outToClient = new ObjectOutputStream(client.getOutputStream());
                outToClient.writeObject(answer);

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
