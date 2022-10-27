package Session11.RMIandMVVM.socketsuppercase.client.core;


import Session11.RMIandMVVM.socketsuppercase.client.network.Client;
import Session11.RMIandMVVM.socketsuppercase.client.network.RMIClient;

public class ClientFactory {

    private Client client;

    public Client getClient() {
        if(client == null) {
            client = new RMIClient();
        }
        return client;
    }
}
