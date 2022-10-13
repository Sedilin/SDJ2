package Session9.RMI1.funcionallity.server;

import Session9.RMI1.funcionallity.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UppercaseServerImpl implements UpperCaseServer {
    public UppercaseServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public String toUppercase(String arg) throws RemoteException {
        return arg.toUpperCase();
    }
}
