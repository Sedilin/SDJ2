package Session9.RMI1.uppercase.client;

import Session9.RMI1.uppercase.shared.UpperCaseServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientImpl implements UpperCaseServer{
    private UpperCaseServer server;

    public ClientImpl(){

    }

    public void initializeConnection()
    {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 0);
            server = (UpperCaseServer) registry.lookup("Server");
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }

    public String toUppercase(String arg)
    {
        String result = null;
        //call the server
        try {
            result = server.toUppercase(arg);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }
}
