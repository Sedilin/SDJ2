package Session2.Sleep;

public class Start {
    public static void main(String[] args) {
        Thread printNumber = new Thread(new PrintNumber(10));

        printNumber.start();
    }
}
