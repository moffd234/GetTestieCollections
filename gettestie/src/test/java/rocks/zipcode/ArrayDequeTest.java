package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    @Test
    public void testAddFirst(){
        Integer expected = 54;

        arrayDeque.addFirst(54);

        Assert.assertEquals(expected, arrayDeque.getFirst());
        arrayDeque.clear();
    }

    @Test
    public void testGetFirst(){
        Integer expected = 21;
        arrayDeque.add(21);
        arrayDeque.add(22);
        arrayDeque.add(44);
        arrayDeque.add(33);
        arrayDeque.add(91);

        Integer actual = arrayDeque.getFirst();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddLast(){
        Integer expected = 91;
        arrayDeque.addLast(91);

        Integer actual = arrayDeque.getLast();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLast(){

        Integer expected = 91;
        arrayDeque.add(21);
        arrayDeque.add(22);
        arrayDeque.add(44);
        arrayDeque.add(33);
        arrayDeque.add(91);

        Integer actual = arrayDeque.getLast();
        Assert.assertEquals(expected, actual);
    }
}
