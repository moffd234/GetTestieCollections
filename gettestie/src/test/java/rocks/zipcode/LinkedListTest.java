package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    LinkedList<Integer> linkedList = new LinkedList<>();

    @Test
    public void testSet(){
        linkedList.add(58);
        linkedList.add(25);
        linkedList.add(54);
        linkedList.set(1, 2);

        int expected = 2;
        int actual = linkedList.get(1);

        Assert.assertEquals(expected, actual);
        linkedList.clear();
    }

    @Test
    public void removeFirst(){

        linkedList.add(58);
        linkedList.add(25);
        linkedList.add(54);


        int expected = 54;
        linkedList.removeFirst();
        int actual = linkedList.get(1);

        Assert.assertEquals(expected, actual);
        linkedList.clear();
    }

    @Test
    public void toArray(){

        Object[] expected = {1};

        linkedList.add(1);
        Object[] actual = linkedList.toArray();

        Assert.assertEquals(expected, actual);
        linkedList.clear();
    }

    @Test
    public void offer(){
        Integer expected = 5;
        linkedList.add(1);
        linkedList.offer(5);

        Integer actual = linkedList.get(1);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void indexOf(){
        int expected = 2;

        linkedList.add(58);
        linkedList.add(25);
        linkedList.add(54);

        int actual = linkedList.indexOf(54);

        Assert.assertEquals(expected, actual);
    }
}
