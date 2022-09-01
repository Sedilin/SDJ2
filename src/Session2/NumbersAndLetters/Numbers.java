package Session2.NumbersAndLetters;

public class Numbers implements Runnable{
    private int numberOfIteration;

    public Numbers(int numberOfIteration)
    {
        this.numberOfIteration = numberOfIteration;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < numberOfIteration; i++) {
            System.out.println(i);
        }
    }

}
