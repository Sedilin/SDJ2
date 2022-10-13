package Session9.RMI1.callback.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote {

    void toUppercase(String arg, UpperCaseClient client) throws RemoteException;
}
