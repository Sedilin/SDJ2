package Session9.RMI1.funcionallity.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote {

    String toUppercase(String arg) throws RemoteException;
}
