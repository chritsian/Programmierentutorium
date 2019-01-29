package edu.kit.informatik.task.sort;

/**
 * 
 * Interface to be implemented by SortAlgo classes.
 * 
 * @author christian
 *
 */
public interface SortAlgo {

    /**
     * Sorts an array ascendant, e.g {4,3,5} => {3,4,5}
     * @param input an unsorted int array
     * @return the sorted array
     */
    public int[] sortAsc(int[] input);
    
    
    /**
     * Sorts an array descending, e.g {4,3,5} => {5,4,3}
     * @param input an unsorted int array
     * @return the sorted array
     */
    public int[] sortDesc(int[] input);
}
