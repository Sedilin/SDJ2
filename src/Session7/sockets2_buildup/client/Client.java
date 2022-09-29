package Session7.sockets2_buildup.client;

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
            System.out.println("Please type message >");

            String scanned = scanner.nextLine();
            outToServer.writeObject(scanned);

            String result = (String) inFromServer.readObject();
            System.out.println("Client received: "+result);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
