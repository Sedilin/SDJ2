package Session9.RMI1.broadcast.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseClient extends Remote {

    void update(String arg) throws RemoteException;
}
