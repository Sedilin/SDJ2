package Session11.RMIandMVVM.socketsuppercase.server.networking;

import Session11.RMIandMVVM.socketsuppercase.server.model.TextManager;
import Session11.RMIandMVVM.socketsuppercase.shared.networking.ClientCallback;
import Session11.RMIandMVVM.socketsuppercase.shared.networking.RMIServer;
import Session11.RMIandMVVM.socketsuppercase.shared.transferobjects.LogEntry;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class RMIServerImpl implements RMIServer, PropertyChangeListener {

    private TextManager textManager;

    public RMIServerImpl(TextManager textManager) throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
        this.textManager = textManager;
    }

    public void startServer()
    {
        Registry registry = null;
        try {
            registry = LocateRegistry.createRegistry(1099);
            registry.bind("UppercaseServer", this);
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toUppercase(String str) throws RemoteException {
        return textManager.toUppercase(str);
    }

    @Override
    public List<LogEntry> getLogs() throws RemoteException {
        return textManager.getLog();
    }

    @Override
    public void registerCallback(ClientCallback ccb) throws RemoteException {
        textManager.addListener("NewLogEntry", evt -> {
            try {
                ccb.update((LogEntry) evt.getNewValue());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        });
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
