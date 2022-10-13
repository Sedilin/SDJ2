package Session9.RMI1.uppercase.client;

import java.util.Scanner;

public class RunClient {
    public static void main(String[] args) {
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

            result = client.toUppercase(read);
            System.out.println("Result: " + result);
        }
    }
}
