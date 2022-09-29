package Session7.sockets2_buildup.server;

import Session7.sockets2_buildup.util.Message;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private List<ServerSocketHandler> conns = new ArrayList<>();

    public void addClient(ServerSocketHandler ssh)
    {
        conns.add(ssh);
    }

    public void removeClient(ServerSocketHandler ssh)
    {
        if (conns.contains(ssh))
        {
            conns.remove(ssh);
        }
    }

    public void broadcast(Message msg)
    {
        System.out.println("Sending: " + msg + " to " + conns.size() + " clients.");
        for (ServerSocketHandler ssh: conns)
        {
            ssh.sendMessage(msg);
        }
    }
}
