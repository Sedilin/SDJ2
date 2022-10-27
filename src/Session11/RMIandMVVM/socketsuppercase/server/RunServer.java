package Session11.RMIandMVVM.socketsuppercase.server;


import Session11.RMIandMVVM.socketsuppercase.server.model.TextManagerImpl;
import Session11.RMIandMVVM.socketsuppercase.server.networking.RMIServerImpl;

import java.rmi.RemoteException;

public class RunServer {
    public static void main(String[] args) throws RemoteException {

        RMIServerImpl ss = new RMIServerImpl(new TextManagerImpl());
        ss.startServer();
    }
}
