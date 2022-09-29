package Session7.sockets2_buildup.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void startServer() {
        System.out.println("Starting server...");
        try{
            ServerSocket serverSocket = new ServerSocket(2910);

            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");

                ObjectInputStream inFromClient = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream outToClient = new ObjectOutputStream(socket.getOutputStream());

                String read = (String) inFromClient.readObject();
                System.out.println("Received from client: "+read);
                String result = read.toUpperCase();

                outToClient.writeObject(result);
            }
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
