package SWE;

import java.util.Random;

public class Die {
    private int faceValue;
    Random rand = new Random();

    public Die(){faceValue = 0;}

    public int getFaceValue()
    {
        return faceValue;
    }
    public void roll()
    {
        faceValue = 1 + rand.nextInt(5);
    }
}
