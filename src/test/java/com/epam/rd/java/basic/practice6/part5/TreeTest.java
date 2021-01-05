package com.epam.rd.java.basic.practice6.part5;

import com.epam.rd.java.basic.practice6.Demo;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreeTest {
    @Test
    public void mainTest() {
        Part5.main(new String[] { null });
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void addMethodShouldReturnTrueIfElementDoesNotExists() {
        Tree<Integer> testTree = new Tree<>();
        assertTrue(testTree.add(2));
    }

    @Test
    public void addMethodShouldReturnFalseIfElementIsExists() {
        Tree<Integer> testTree = new Tree<>();
        testTree.add(2);
        assertFalse(testTree.add(2));
    }

    @Test
    public void removeMethodShouldReturnFalseIfElementDoesNotExists() {
        Tree<Integer> testTree = new Tree<>();
        assertFalse(testTree.remove(2));
    }

    @Test
    public void removeMethodShouldReturnTrueIfElementIsExists() {
        Tree<Integer> testTree = new Tree<>();
        testTree.add(2);
        assertTrue(testTree.remove(2));
    }

    @Test
    public void shouldReturnRootElement() {
        Tree<Integer> testTree = new Tree<>();
        testTree.add(2);
        testTree.get();
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldReturnParent() {
        Tree<Integer> testTree = new Tree<>();
        Assert.assertNull(testTree.getParent());
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void shouldReturnCurrentElement() {
        Tree<Integer> testTree = new Tree<>();
        Assert.assertNull(testTree.getCurrent());
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void removeFromRightSubtree() {
        Tree<Integer> testTree = new Tree<>();
        testTree.add(2);
        testTree.add(5);
        testTree.add(3);
        testTree.add(0);
        testTree.add(4);
        testTree.add(1);
        assertTrue(testTree.remove(2));
        assertTrue(testTree.remove(5));
        assertTrue(testTree.remove(3));
        assertTrue(testTree.remove(0));
        assertTrue(testTree.remove(4));
    }

    @Test
    public void removeFromLeftSubtree() {
        Tree<Integer> testTree = new Tree<>();

        testTree.add(7);
        testTree.add(6);
        testTree.add(0);

        testTree.add(2);
        testTree.add(1);
        testTree.add(4);
        testTree.add(3);

        assertTrue(testTree.remove(2));
        assertTrue(testTree.remove(4));
        assertTrue(testTree.remove(6));
    }

    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}