package practice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WorkerTest {

    @Test
    public void testIncrementDecrement() {
        final String key = "Test";
        Worker w = new Worker();
        w.increment(key);
        assertEquals(1, w.get(key));
        w.decrement(key);
        assertEquals(0, w.get(key));
    }
    
}
