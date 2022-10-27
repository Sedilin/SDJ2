package Session11.RMIandMVVM.socketsuppercase.shared.networking;


import Session11.RMIandMVVM.socketsuppercase.shared.transferobjects.LogEntry;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMIServer extends Remote {

    String toUppercase(String str) throws RemoteException;
    List<LogEntry> getLogs() throws RemoteException;
    void registerCallback(ClientCallback ccb) throws RemoteException;
}
