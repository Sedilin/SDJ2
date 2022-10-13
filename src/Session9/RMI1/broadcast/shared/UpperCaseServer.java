package Session9.RMI1.broadcast.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote {

    String toUppercase(String arg, UpperCaseClient client) throws RemoteException;
    void registerClient(UpperCaseClient client) throws RemoteException;
}
