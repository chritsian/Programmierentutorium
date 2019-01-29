package edu.kit.informatik.task.search;

import java.util.Arrays;

/**
 * 
 * Implements the binary search on an array.
 * 
 * @author christian
 *
 */
public class BinarySearch {
    
    private int[] input;
    
    /**
     * Sets the array where you can search.
     * 
     * @param input array for search
     */
    public BinarySearch(int[] input) {
        this.input = input;
    }

    /**
     * checks if element is in array using binary search
     * 
     * @param element int value
     * @return true - element is in array
     *         false - element is not in array
     */
    public boolean search(int element) {
        
        //end point of recursion
        if (input.length == 1 && input[0] == element){
            return true;
        } else if (input.length <= 1) {
            return false;
        }
        
        if (input[input.length / 2] == element) {
            return true;
        } else if (input[input.length / 2] > element) {
            input = Arrays.copyOf(input, input.length/2);
            return search(element);
        } else if (input[input.length / 2] < element) {
            input = Arrays.copyOfRange(input, input.length/2, input.length);
            return search(element);
        } else {
            return false;
        }
    }
}
