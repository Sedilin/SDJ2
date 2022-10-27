package Session11.RMIandMVVM.socketsuppercase.client.network;


import Session11.RMIandMVVM.socketsuppercase.shared.networking.ClientCallback;
import Session11.RMIandMVVM.socketsuppercase.shared.networking.RMIServer;
import Session11.RMIandMVVM.socketsuppercase.shared.transferobjects.LogEntry;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class RMIClient implements Client, ClientCallback {

    private RMIServer server;
    PropertyChangeSupport support;

    public RMIClient()
    {
        try {
            UnicastRemoteObject.exportObject(this, 0);
            support = new PropertyChangeSupport(this);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startClient() {
        Registry registry = null;
        try {
            registry = LocateRegistry.getRegistry("localhost", 1099);
            server = (RMIServer) registry.lookup("UppercaseServer");
            server.registerCallback(this);
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toUppercase(String str) {
        try {
            return server.toUppercase(str);
        } catch (RemoteException e) {
            throw new RuntimeException("Could not connect to the server.");
        }
    }

    @Override
    public List<LogEntry> getLog() {
        try {
            return server.getLogs();
        } catch (RemoteException e) {
            throw new RuntimeException("Could not connect to the server.");
        }
    }


    @Override
    public void update(LogEntry entry) throws RemoteException {
        support.firePropertyChange("NewLogEntry", null, entry);
    }

    @Override
    public void addListener(String eventName, PropertyChangeListener listener) {
        support.addPropertyChangeListener(eventName, listener);
    }

    @Override
    public void removeListener(String eventName, PropertyChangeListener listener) {
        support.removePropertyChangeListener(eventName, listener);
    }
}
