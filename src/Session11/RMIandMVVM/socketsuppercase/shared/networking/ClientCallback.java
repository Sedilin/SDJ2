package Session11.RMIandMVVM.socketsuppercase.shared.networking;


import Session11.RMIandMVVM.socketsuppercase.shared.transferobjects.LogEntry;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallback extends Remote {
    void update(LogEntry entry) throws RemoteException;
}
