package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    @Test
    public void testPeek(){

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        Integer expected = 1;

        queue.add(1);
        queue.add(3);
        queue.add(2);
        Integer actual = queue.peek();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPoll(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int expected = 1;

        queue.add(1);
        queue.add(3);
        queue.add(2);

        int actual = queue.poll();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(1);

        Assert.assertTrue(queue.contains(1));
    }

    @Test
    public void testOffer(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.offer(1);

        Assert.assertTrue(queue.contains(1));
    }

}
