package Session9.RMI1.callback.client;

import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient {
    public static void main(String[] args) throws RemoteException {
        ClientImpl client = new ClientImpl();
        client.initializeConnection(); //

        Scanner scan = new Scanner(System.in);

        String read = "";
        String result = "";
        while (true)
        {
            System.out.print("Input: ");
            read = scan.nextLine();
            if (read.equalsIgnoreCase("exit")) break;

            client.toUppercase(read); // call server + the server calls client back
        }
    }
}
