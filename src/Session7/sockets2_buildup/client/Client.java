package Session7.sockets2_buildup.client;

import Session7.sockets2_buildup.util.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public void startClient() {
        try{
            Socket socket = new Socket("localhost", 2910);
            System.out.println("Connected to the server");

            ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());

            Scanner scanner = new Scanner(System.in);

            while (true)
            {
                System.out.println("Please type message >");

                String scanned = scanner.nextLine();
                Message msg = new Message(scanned);

                outToServer.writeObject(msg);
                if (msg.getMessageBody().equalsIgnoreCase("exit"))
                {
                    socket.close();
                    System.out.println("Client exits.");
                    break;
                }

                Message result = (Message) inFromServer.readObject();
                System.out.println("Client received: "+result);
            }

        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
