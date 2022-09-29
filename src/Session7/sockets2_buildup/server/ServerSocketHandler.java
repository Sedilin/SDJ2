package Session7.sockets2_buildup.server;

import Session7.sockets2_buildup.util.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable {

    private Socket socket;
    private ObjectInputStream inFromClient;
    private ObjectOutputStream outToClient;

    public ServerSocketHandler(Socket socket) {
        this.socket = socket;
        try
        {
             inFromClient = new ObjectInputStream(socket.getInputStream());
             outToClient = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                Message read = (Message) inFromClient.readObject();
                System.out.println("Received from client: " + read);
                if (read.getMessageBody().equalsIgnoreCase("exit")) {
                    socket.close();
                    System.out.println("Client disconnected");
                    break;
                }

                String result = read.getMessageBody().toUpperCase();
                outToClient.writeObject(new Message(result));
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
