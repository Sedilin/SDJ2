package Session2.NumbersAndLetters;

public class ThreadsRun {
    public static void main(String[] args) {

        Thread numberThread = new Thread(new Numbers(57));
        Thread letterThread = new Thread(new Letters(50));

        numberThread.start();
        letterThread.start();
    }
}
