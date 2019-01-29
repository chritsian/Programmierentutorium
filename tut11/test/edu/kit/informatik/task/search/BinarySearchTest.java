package edu.kit.informatik.task.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests if BinarySearch implementation works correctly.
 * 
 * @author christian
 *
 */
class BinarySearchTest {
    
    private BinarySearch binarySearch;
    
    private static final int[] sortedArray = {3,4,5,6,7,8};
    private static final int isIn = 3;
    private static final int notIn = 9;  
    
    //important to use BeforeEach because state of input changes during tests.
    @BeforeEach
    void setUp() throws Exception {
        binarySearch = new BinarySearch(sortedArray);
    }

    @Test
    void testIsIn() {
        assertTrue(binarySearch.search(isIn));
    }
    
    @Test
    void testNotIn() {
        assertFalse(binarySearch.search(notIn));
    }

}
