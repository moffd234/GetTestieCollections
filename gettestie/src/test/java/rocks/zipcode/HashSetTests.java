package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTests {

    HashSet<Integer> hashSet = new HashSet<>();

    @Test
    public void addTest() throws Exception {

        hashSet.add(1);
        hashSet.add(2);

        Assert.assertTrue(hashSet.contains(2));
        hashSet.clear();
    }

    @Test
    public void isEmpty() {
        hashSet.add(1);
        hashSet.add(2);

        Assert.assertTrue(hashSet.contains(2));
        hashSet.clear();

        Assert.assertTrue(hashSet.isEmpty());
    }

    @Test
    public void sizeTest() {
        hashSet.add(1);
        hashSet.add(2);

        int expected = 2;
        int actual = hashSet.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {

        hashSet.add(12431);
        hashSet.add(2321);

        Assert.assertTrue(hashSet.contains(2321));
        hashSet.clear();
    }

    @Test
    public void testRemove(){
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.remove(3);

        Assert.assertFalse(hashSet.contains(3));
        hashSet.clear();
    }
}
