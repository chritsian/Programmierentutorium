package edu.kit.informatik.task.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * Tests if InsertionSort implementation works correctly.
 * 
 * @author christian
 *
 */
class InsertionSortTest {
    
    private InsertionSort sort;
    
    private static final int[] sortedAsc = {3,4,5,6,7,8};
    private static final int[] sortedDesc = {8,7,6,5,4,3};
    private static final int[] unsorted = {4,3,5,8,7,6};

    @BeforeEach
    void setUp() throws Exception {
        sort = new InsertionSort();
    }

    @AfterEach
    void tearDown() throws Exception {
        sort = null;
    }

    @Test
    void testSortAsc() {
        assertArrayEquals(sort.sortAsc(unsorted), sortedAsc);
    }
    
    @Test
    void testSortAscFalse() {
        assertFalse(Arrays.equals(sort.sortAsc(unsorted), sortedDesc));
    }
    
    @Test
    void testSortDesc() {
        assertArrayEquals(sort.sortDesc(unsorted), sortedDesc);
    }
    
    @Test
    void testSortFalse() {
        assertFalse(Arrays.equals(sort.sortDesc(unsorted), sortedAsc));
    }

}
