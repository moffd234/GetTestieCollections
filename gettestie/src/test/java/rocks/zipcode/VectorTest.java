package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void testTrim(){
        Vector<Integer> vector = new Vector<Integer>(500);
        Integer expected = 1;

        vector.add(1);
        vector.trimToSize();
        Integer actual = vector.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty(){
        Vector<Integer> vector = new Vector<Integer>(500);

        Assert.assertTrue(vector.isEmpty());
    }

    @Test
    public void testElementAt(){
        Vector<Integer> vector = new Vector<Integer>(500);
        int expected = 230;

        vector.add(0, 23);
        vector.add(1, 24);
        vector.add(2, 230);
        vector.add(3, 14);

        int actual = vector.elementAt(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClone(){
        Vector<Integer> vector = new Vector<Integer>(500);
        vector.add(0, 23);
        vector.add(1, 24);
        vector.add(2, 230);
        vector.add(3, 14);

        Vector<Integer> newVector = (Vector<Integer>) vector.clone();

        Assert.assertEquals(newVector, vector);
    }

    @Test
    public void testCapacity(){
        Vector<Integer> vector = new Vector<Integer>(500);
        int expected = 500;

        int actual = vector.capacity();

        Assert.assertEquals(expected, actual);
    }
}
