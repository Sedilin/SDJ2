package Session2.HiClass;

public class Test {
    public static void main(String[] args) {
        Thread hiThread = new Thread(new Hi());
        Thread helloThread = new Thread(new Hello());

        hiThread.start();
        helloThread.start();
    }
}
