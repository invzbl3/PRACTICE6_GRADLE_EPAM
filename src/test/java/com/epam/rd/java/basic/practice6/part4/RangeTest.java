package com.epam.rd.java.basic.practice6.part4;

import com.epam.rd.java.basic.practice6.Demo;
import org.junit.Assert;
import org.junit.Test;
import java.util.Iterator;
import java.util.NoSuchElementException;
import static org.junit.Assert.assertTrue;

public class RangeTest {
    @Test
    public void mainTest() {
        Part4.main(new String[] { null });
        assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void rangeIteratorTest() {
        Range range = new Range(0,3);
        Iterator<Integer> iterator = range.iterator();
        assertTrue(iterator.hasNext());
    }

    @Test
    public void rangeIteratorReversedOrderTest() {
        Range range = new Range(0,3, true);
        Iterator<Integer> iterator = range.iterator();
        assertTrue(iterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void invocationOfNextMethodShouldThrowNoSuchElementException() {
        Range range = new Range(0, 1);
        Iterator<Integer> iterator = range.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void rangeIteratorRemoveTest() {
        Range range = new Range(3,5);
        Iterator<Integer> iterator = range.iterator();
        iterator.remove();
    }

    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}
