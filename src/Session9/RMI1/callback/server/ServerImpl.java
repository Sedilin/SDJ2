package Session9.RMI1.callback.server;

import Session9.RMI1.callback.shared.UpperCaseClient;
import Session9.RMI1.callback.shared.UpperCaseServer;

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
    public void toUppercase(String arg, UpperCaseClient client) throws RemoteException {
        String result = arg.toUpperCase();
        //heavy stuff

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        client.uppercaseResult(result);
    }
}
