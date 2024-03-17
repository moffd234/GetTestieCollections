package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;
import java.util.Vector;

public class TreeMapTest {

    @Test
    public void testClone(){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);


        TreeMap<Integer, Integer> newTreeMap = (TreeMap<Integer, Integer>) treeMap.clone();

        Assert.assertEquals(newTreeMap, treeMap);
    }

    @Test
    public void testCeilingKey(){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(50, 50);
        treeMap.put(500, 50);
        treeMap.put(25, 50);
        treeMap.put(10, 50);

        int expected = 10;

        int actual = treeMap.ceilingKey(10);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testContainsKey(){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(50, 50);
        treeMap.put(500, 50);
        treeMap.put(25, 50);
        treeMap.put(10, 50);

        boolean actual = treeMap.containsKey(500);
        Assert.assertTrue(actual);

    }

    @Test
    public void testFloorKey(){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(50, 50);
        treeMap.put(500, 50);
        treeMap.put(25, 50);
        treeMap.put(10, 50);

        int expected = 10;

        int actual = treeMap.floorKey(10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetValueFromKey(){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(50, 501);
        treeMap.put(500, 50);
        treeMap.put(25, 502);
        treeMap.put(10, 503);

        int expected = 50;

        int actual = treeMap.get(500);

        Assert.assertEquals(expected, actual);
    }

}
