package Session9.RMI1.funcionallity.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LowerCaseServer extends Remote {
    String toLowerCase(String arg) throws RemoteException;
}
