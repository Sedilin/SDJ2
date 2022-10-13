package Session9.RMI1.broadcast.server;

import Session9.RMI1.broadcast.shared.UpperCaseClient;
import Session9.RMI1.broadcast.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServerImpl implements UpperCaseServer {


    private List<UpperCaseClient> broadcastClients = new ArrayList<>();
    public ServerImpl()
    {
        try {
            UnicastRemoteObject.exportObject(this, 1099);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toUppercase(String arg, UpperCaseClient client) {
        String result = arg.toUpperCase();
        //heavy stuff

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            broadcastToClient(result, client);

        return result;
    }

    private void broadcastToClient(String arg, UpperCaseClient client)
    {
        for (UpperCaseClient bClient : broadcastClients)
        {
            if (!bClient.equals(client))
            {
                try {
                    bClient.update(arg);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void registerClient(UpperCaseClient client) throws RemoteException {
        broadcastClients.add(client);
    }
}
