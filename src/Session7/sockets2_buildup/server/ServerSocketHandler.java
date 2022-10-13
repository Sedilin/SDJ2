package Session7.sockets2_buildup.server;

import Session7.sockets2_buildup.util.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable {

    private Socket socket;
    private ConnectionPool connectionPool;
    private ObjectInputStream inFromClient;
    private ObjectOutputStream outToClient;

    public ServerSocketHandler(Socket socket, ConnectionPool connectionPool) {
        this.socket = socket;
        this.connectionPool = connectionPool;
        try
        {
             inFromClient = new ObjectInputStream(socket.getInputStream());
             outToClient = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(Message msg)
    {
        try {
            outToClient.writeObject(msg);
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
                    connectionPool.removeClient(this);
                    System.out.println("Client disconnected");
                    break;
                }
                connectionPool.broadcast(read);

            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
