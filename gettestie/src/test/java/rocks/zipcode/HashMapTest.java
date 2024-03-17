package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    HashMap<Integer, String> hashMap = new HashMap<>();

    @Test
    public void testPut(){
        hashMap.put(1, "One");

        Assert.assertTrue(hashMap.containsKey(1));
        hashMap.clear();
    }

    @Test
    public void testGetKey(){
        String expected = "One";
        hashMap.put(1, "One");

        String actual = hashMap.get(1);


        Assert.assertEquals(expected, actual);
        hashMap.clear();
    }

    @Test
    public void testContainsValue(){
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");

        Assert.assertTrue(hashMap.containsValue("Four"));
        hashMap.clear();
    }

    @Test
    public void testContainsKey(){
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");

        Assert.assertTrue(hashMap.containsKey(4));
        hashMap.clear();
    }

    @Test
    public void testRemove(){

        hashMap.put(3, "Three");

        hashMap.remove(3);

        Assert.assertTrue(hashMap.isEmpty());

    }

    @Test
    public void isEmpty(){
        Assert.assertTrue(hashMap.isEmpty());
    }


}
