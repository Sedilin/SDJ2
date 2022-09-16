package Session6.sockets1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 2910);

            System.out.println("Client is started");
            Scanner scanner = new Scanner(System.in);

            System.out.println("'uppercase' or 'lowercase'?: ");
            String c = scanner.nextLine();

            ObjectOutputStream choice = new ObjectOutputStream(client.getOutputStream());
            choice.writeObject(c);


            System.out.println("What word you want to use?: ");
            String w = scanner.nextLine();

            ObjectOutputStream word = new ObjectOutputStream(client.getOutputStream());
            word.writeObject(w);

            ObjectInputStream inFromServer = new ObjectInputStream(client.getInputStream());
            String answer = (String) inFromServer.readObject();

            System.out.println("Client received: " + answer);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
