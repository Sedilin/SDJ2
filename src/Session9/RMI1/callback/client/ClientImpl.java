package Session9.RMI1.callback.client;

import Session9.RMI1.callback.shared.UpperCaseClient;
import Session9.RMI1.callback.shared.UpperCaseServer;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ClientImpl implements UpperCaseClient {

    private UpperCaseServer server;

    public ClientImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
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

    public void toUppercase(String arg)
    {
        try {
            server.toUppercase(arg, this);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void uppercaseResult(String arg) throws RemoteException {
        System.out.println("Result: " + arg);
    }
}
