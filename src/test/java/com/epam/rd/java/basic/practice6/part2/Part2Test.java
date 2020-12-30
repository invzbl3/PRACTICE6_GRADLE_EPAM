package com.epam.rd.java.basic.practice6.part2;

import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class Part2Test {
    @Test
    public void shouldReturnCorrectComparisonRemoveByIndex() {
        int k = 4;
        int n = 10_000;
        List<Integer> arrayImpl = Part2.fill(n, new ArrayList<>());
        List<Integer> listImpl = Part2.fill(n, new LinkedList<>());
        assertTrue(Part2.removeByIndex(arrayImpl,k) < Part2.removeByIndex(listImpl, k));
    }
    @Test
    public void shouldReturnCorrectComparisonRemoveByIterator() {
        int k = 4;
        int n = 10_000;
        List<Integer> arrayImpl = Part2.fill(n, new ArrayList<>());
        List<Integer> listImpl = Part2.fill(n, new LinkedList<>());
        assertTrue(Part2.removeByIterator(arrayImpl,k) > Part2.removeByIterator(listImpl, k));
    }
}