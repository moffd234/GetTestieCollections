package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertFalse(stack.isEmpty()); // false
    }

    @org.junit.Test
    public void testPop(){

        Stack<Integer> stack = new Stack<>();

        Integer expected = 2;

        stack.add(1);
        stack.add(3);
        stack.add(2);
        Integer actual = stack.pop();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testPush(){
        Stack<Integer> stack = new Stack<>();

        Integer expected = 2;

        stack.push(1);
        stack.push(3);
        stack.push(2);
        Integer actual = stack.pop();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeek(){
        Stack<Integer> stack = new Stack<>();

        Integer expected = 2;

        stack.add(1);
        stack.add(3);
        stack.add(2);
        Integer actual = stack.peek();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty(){
        Stack<Integer> stack = new Stack<>();
        Assert.assertTrue(stack.isEmpty());
    }

}
