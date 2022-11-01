package Session12.TestingAQueue.simpl;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleBoundedArrayQueueCorrectTest {
    QueueADT<String> q;
    @Before
    public void setUp() throws Exception {
        q = new SimpleBoundedArrayQueueCorrect<>(6);
    }

    @Test
    public void enqueue() {
        q.enqueue("Elephant");
        assertEquals(q.first(), "Elephant");
    }
}