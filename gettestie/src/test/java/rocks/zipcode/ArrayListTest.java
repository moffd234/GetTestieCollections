package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    ArrayList<Integer> arrayList = new ArrayList<>();

    @Test
    public void addTest() throws Exception {

        arrayList.add(1);
        arrayList.add(2);

        Assert.assertTrue(arrayList.contains(2));
        arrayList.clear();
    }

    @Test
    public void isEmpty() {
        arrayList.add(1);
        arrayList.add(2);

        Assert.assertTrue(arrayList.contains(2));
        arrayList.clear();

        Assert.assertTrue(arrayList.isEmpty());
    }

    @Test
    public void sizeTest() {
        arrayList.add(1);
        arrayList.add(2);

        int expected = 2;
        int actual = arrayList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {

        arrayList.add(12431);
        arrayList.add(2321);

        Assert.assertTrue(arrayList.contains(2321));
        arrayList.clear();
    }

    @Test
    public void testRemove(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.remove(3);

        Assert.assertFalse(arrayList.contains(4));
        arrayList.clear();
    }
}
