package Session9.RMI1.uppercase.server;

import Session9.RMI1.uppercase.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl implements UpperCaseServer {


    public ServerImpl()
    {
        try {
            UnicastRemoteObject.exportObject(this, 1099);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toUppercase(String arg) throws RemoteException {
        return arg.toUpperCase();
    }
}
