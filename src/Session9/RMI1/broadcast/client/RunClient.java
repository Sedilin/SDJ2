package Session9.RMI1.broadcast.client;

import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient {
    public static void main(String[] args) throws RemoteException {
        ClientImpl client = new ClientImpl();
        client.initializeConnection(); //

        Scanner scan = new Scanner(System.in);

        String read = "";
        while (true)
        {
            System.out.print("Input: ");
            read = scan.nextLine();
            if (read.equalsIgnoreCase("exit")) break;

            String result = client.toUppercase(read);
            System.out.println("Result: " + result);
        }
    }
}
