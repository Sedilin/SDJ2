package Session2.Bear;

public class Bear implements Runnable{

    private Thread otherBear;

    //Constructor to know about other bear
    public Bear(Thread otherBear)
    {
        this.otherBear = otherBear;
    }
    //Empty constructor to create the first bear
    public Bear()
    {
        otherBear = null;
    }

    @Override
    public void run() {
        System.out.println("Bear is feeling tired");
        System.out.println("Bear goes to sleep");

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e)
        {
            System.out.println("Angry bear grrrr");
            //If a bear is not null it wakes other bear
            if (otherBear != null)
                otherBear.interrupt();
        }


    }
}
