package SWE;

public class DiceGame {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        do {

            die1.roll();
            System.out.println("The value of the dice 1: " + die1.getFaceValue());

            die2.roll();
            System.out.println("The value of the dice 2: " + die2.getFaceValue());
            System.out.println();
        }
        while(die1.getFaceValue() + die2.getFaceValue() != 7);

        System.out.println("Victory!");
    }
}
