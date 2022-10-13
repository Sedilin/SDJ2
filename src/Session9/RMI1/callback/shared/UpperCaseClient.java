package Session9.RMI1.callback.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseClient extends Remote {

    void uppercaseResult(String arg) throws RemoteException;
}
