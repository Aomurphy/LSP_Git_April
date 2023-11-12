package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntegerSetTest {
    private IntegerSet intSet;

    @Before
    public void setUp() {
        intSet = new IntegerSet();
    }

    @Test
    public void testAdd() {
        intSet.add(5);
        assertTrue(intSet.contains(5));
    }

    @Test
    public void testRemove() {
        intSet.add(5);
        intSet.remove(5);
        assertFalse(intSet.contains(5));
    }

    @Test
    public void testUnion() {
        IntegerSet intSetB = new IntegerSet();
        intSet.add(1);
        intSetB.add(2);
        intSet.union(intSetB);
        assertTrue(intSet.contains(1));
        assertTrue(intSet.contains(2));
    }

    @Test
    public void testIntersect() {
        IntegerSet intSetB = new IntegerSet();
        intSet.add(1);
        intSet.add(2);
        intSetB.add(2);
        intSet.intersect(intSetB);
        assertFalse(intSet.contains(1));
        assertTrue(intSet.contains(2));
    }

    @Test
    public void testDiff() {
        IntegerSet intSetB = new IntegerSet();
        intSet.add(1);
        intSet.add(2);
        intSetB.add(2);
        intSet.diff(intSetB);
        assertTrue(intSet.contains(1));
        assertFalse(intSet.contains(2));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(intSet.isEmpty());
        intSet.add(5);
        assertFalse(intSet.isEmpty());
    }

    @Test
    public void testClear() {
        intSet.add(5);
        intSet.clear();
        assertTrue(intSet.isEmpty());
    }

    @Test
    public void testToString() {
        intSet.add(1);
        intSet.add(2);
        assertEquals("[1, 2]", intSet.toString());
    }

    @Test
    public void testEquals() {
        IntegerSet intSetB = new IntegerSet();
        intSet.add(1);
        intSetB.add(1);
        assertTrue(intSet.equals(intSetB));
    }

    @Test
    public void testComplement() {
        IntegerSet intSetB = new IntegerSet();
        intSet.add(1);
        intSetB.add(1);
        intSet.complement(intSetB);
        assertTrue(intSet.isEmpty());
    }

    @Test
    public void testLargest() throws IntegerSetException {
        intSet.add(3);
        intSet.add(2);
        intSet.add(5);
        assertEquals(5, intSet.largest());
    }

    @Test(expected = IntegerSetException.class)
    public void testLargestEmptySet() throws IntegerSetException {
        intSet.largest();
    }

    @Test
    public void testSmallest() throws IntegerSetException {
        intSet.add(3);
        intSet.add(2);
        intSet.add(5);
        assertEquals(2, intSet.smallest());
    }

    @Test(expected = IntegerSetException.class)
    public void testSmallestEmptySet() throws IntegerSetException {
        intSet.smallest();
    }

    @Test
    public void testLength() {
        intSet.add(3);
        intSet.add(2);
        intSet.add(5);
        assertEquals(3, intSet.length());
    }
}
