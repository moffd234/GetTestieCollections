package rocks.zipcode;
 
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class ComparableTest {
    @Test
    public void testCompareString(){
        Comparator<String> newComp = String::compareTo;

        String string1 = "dsada";
        String string2 = "dsada";

        Assert.assertEquals(0, newComp.compare(string1, string2));
    }

    @Test
    public void testCompareString1(){
        Comparator<String> newComp = String::compareTo;

        String string1 = "csada";
        String string2 = "dsada";

        Assert.assertEquals(-1, newComp.compare(string1, string2));
    }
    @Test
    public void testCompareString2(){
        Comparator<String> newComp = String::compareTo;

        String string1 = "esada";
        String string2 = "dsada";

        Assert.assertEquals(1, newComp.compare(string1, string2));
    }
    @Test
    public void testCompareIntegers(){
        Comparator<Integer> newComp = Integer::compareTo;

        Integer int1 = 1;
        Integer int2 = 2;

        Assert.assertEquals(-1, newComp.compare(int1, int2));
    }

    @Test
    public void testCompareIntegers1(){
        Comparator<Integer> newComp = Integer::compareTo;

        Integer int1 = 2;
        Integer int2 = 2;

        Assert.assertEquals(0, newComp.compare(int1, int2));
    }

    @Test
    public void testCompareIntegers2(){
        Comparator<Integer> newComp = Integer::compareTo;

        Integer int1 = 3;
        Integer int2 = 2;

        Assert.assertEquals(1, newComp.compare(int1, int2));
    }


}
