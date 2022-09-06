package Session2.Bear;
import java.util.ArrayList;

public class BearPokingRun {
    public static void main(String[] args) {

        Thread bear1 = new Thread(new Bear());
        Thread bear2 = new Thread(new Bear(bear1));
        Thread bear3 = new Thread(new Bear(bear2));
        Thread bear4 = new Thread(new Bear(bear3));
        Thread bear5 = new Thread(new Bear(bear4));

        //A list of all bears
        ArrayList<Thread> bears = new ArrayList<>();
        bears.add(bear1);
        bears.add(bear2);
        bears.add(bear3);
        bears.add(bear4);
        bears.add(bear5);

        //A poking man object
        Thread pokingManThread = new Thread(new PokingMan(bears.get(4)));

        //all bears fall asleep
        for (Thread bear : bears) {
            bear.start();
        }
        //poking man starts to wonder to poke them
        pokingManThread.start();


    }
}
