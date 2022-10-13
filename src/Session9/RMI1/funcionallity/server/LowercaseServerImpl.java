package Session9.RMI1.funcionallity.server;

import Session9.RMI1.funcionallity.shared.LowerCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class LowercaseServerImpl implements LowerCaseServer {

    public LowercaseServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }
    @Override
    public String toLowerCase(String arg) throws RemoteException {
        return arg.toLowerCase(Locale.ROOT);
    }
}
