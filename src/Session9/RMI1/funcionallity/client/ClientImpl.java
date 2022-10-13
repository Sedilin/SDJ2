package Session9.RMI1.funcionallity.client;

import Session9.RMI1.funcionallity.shared.Server;
import Session9.RMI1.funcionallity.shared.UpperCaseServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientImpl {
    private Server server;

    public ClientImpl(){

    }

    public void initializeConnection()
    {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 0);
            server = (Server) registry.lookup("Server");
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }

    public String toUppercase(String arg)
    {
        try {
            return server.getUpperCase().toUppercase(arg);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return "";
    }
    public String toLowercase(String arg)
    {
        try {
            return server.getLowerCase().toLowerCase(arg);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return "";
    }
}
