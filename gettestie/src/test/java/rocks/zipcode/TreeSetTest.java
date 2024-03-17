package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void testFloor(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        int expected = 10;

        treeSet.add(50);
        treeSet.add(500);
        treeSet.add(25);
        treeSet.add(10);
        treeSet.add(30);


        int actual = treeSet.floor(15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCeiling(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        int expected = 25;

        treeSet.add(50);
        treeSet.add(500);
        treeSet.add(25);
        treeSet.add(10);
        treeSet.add(30);


        int actual = treeSet.ceiling(15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLast(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        int expected = 500;

        treeSet.add(50);
        treeSet.add(500);
        treeSet.add(25);
        treeSet.add(10);
        treeSet.add(30);

        int actual = treeSet.last();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirst(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        int expected = 10;

        treeSet.add(50);
        treeSet.add(500);
        treeSet.add(25);
        treeSet.add(10);
        treeSet.add(30);

        int actual = treeSet.first();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        int expected = 5;

        treeSet.add(50);
        treeSet.add(500);
        treeSet.add(25);
        treeSet.add(10);
        treeSet.add(30);

        int actual = treeSet.size();

        Assert.assertEquals(expected, actual);
    }
}
