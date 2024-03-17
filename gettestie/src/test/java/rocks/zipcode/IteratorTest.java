package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void testHasNext(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        Iterator<Integer> iterator = arrayList.iterator();

        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void testNext(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        int expected = 1;

        Iterator<Integer> iterator = arrayList.iterator();
        int actual = iterator.next();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        int expected = 1;

        Iterator<Integer> iterator = arrayList.iterator();
        iterator.next();
        iterator.next();
        iterator.remove();
        int actual = iterator.next();

        Assert.assertEquals(expected, actual);
    }

}
