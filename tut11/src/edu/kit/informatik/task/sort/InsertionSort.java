package edu.kit.informatik.task.sort;

/**
 * Implements InsertionSort
 * 
 * @author christian
 *
 */
public class InsertionSort implements SortAlgo {

    @Override
    public int[] sortAsc(int[] input) {
        
        for (int i = 1; i < input.length; i++) {
            int temp = input[i];
            int j;
            for (j = i; j > 0 && input[j - 1] > temp; j--) {
                input[j] = input [j - 1];
            }
            input[j] = temp;
        }
        
        return input;
        
    }

    @Override
    public int[] sortDesc(int[] input) {
        
        for (int i = 1; i < input.length; i++) {
            int temp = input[i];
            int j;
            for (j = i; j > 0 && input[j - 1] < temp; j--) {
                input[j] = input [j - 1];
            }
            input[j] = temp;
        }
        
        return input;
    }

}
