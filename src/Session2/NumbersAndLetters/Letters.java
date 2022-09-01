package Session2.NumbersAndLetters;

public class Letters implements Runnable{

    private int numberOfIterations;

    public Letters(int numberOfIterations)
    {
        this.numberOfIterations = numberOfIterations;
    }
    @Override
    public void run() {
        for (int i = 0; i < numberOfIterations; i++) {
            System.out.println(
                    (char) (i+97)
            );
        }
    }
}
