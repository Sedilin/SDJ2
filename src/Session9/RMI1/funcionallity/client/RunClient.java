package Session9.RMI1.funcionallity.client;

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
            System.out.println("Option: ");
            read = scan.nextLine();
            if (read.equalsIgnoreCase("exit")) break;
            else{
                if (read.equalsIgnoreCase("upper"))
                {
                    System.out.print("Input: ");
                    String input = scan.nextLine();
                    System.out.println("Result: " + client.toUppercase(input));
                }
                else if (read.equalsIgnoreCase("lower"))
                {
                    System.out.print("Input: ");
                    String input = scan.nextLine();
                    System.out.println("Result: " + client.toLowercase(input));
                }
                else {
                    System.out.println("Did not understand:(");
                }
            }
        }
    }
}
