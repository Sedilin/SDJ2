package Session2.Bear;

public class Bear implements Runnable{

    @Override
    public void run() {
        System.out.println("Bear is feeling tired");
        System.out.println("Bear goes to sleep");

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e)
        {
            System.out.println("Angry bear grrrr");
        }


    }
}
