package Session9.RMI1.funcionallity.server;

import Session9.RMI1.funcionallity.shared.LowerCaseServer;
import Session9.RMI1.funcionallity.shared.Server;
import Session9.RMI1.funcionallity.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl implements Server {


    public ServerImpl()
    {
        try {
            UnicastRemoteObject.exportObject(this, 1099);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }


    @Override
    public LowerCaseServer getLowerCase() {
        try {
            return new LowercaseServerImpl();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public UpperCaseServer getUpperCase() {
        try {
            return new UppercaseServerImpl();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }
}
