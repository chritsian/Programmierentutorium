package edu.kit.informatik.task.sort;

/**
 * Implements SelectionSort
 * 
 * @author christian
 *
 */
public class SelectionSort implements SortAlgo {

    @Override
    public int[] sortAsc(int[] input) {
        int min = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
            min = i + 1;
        }
        return input;
    }

    @Override
    public int[] sortDesc(int[] input) {
        int min = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[j] > input[min]) {
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
            min = i + 1;
        }
        return input;
    }

}
