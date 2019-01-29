package edu.kit.informatik.task.ui;

import java.util.Arrays;

import edu.kit.informatik.task.search.BinarySearch;
import edu.kit.informatik.task.sort.InsertionSort;
import edu.kit.informatik.task.sort.SelectionSort;
import edu.kit.informatik.task.sort.SortAlgo;

/**
 * Provides a UserInterface to interact with sort and search algorithms.
 * 
 * @author christian
 *
 */
public class UserInterface {
    
    private SortAlgo sort;

    /**
     * starts the UI
     * 
     * @param args run arguments
     */
    public static void main(String[] args) {
        
           UserInterface ui = new UserInterface();
           ui.start();
    
    }

    private void start() {
        sort = new InsertionSort();
        
        String s = Terminal.readLine();
        
        while (!s.equals("quit")) {
            String[] input = s.split(" ");
            
            if (input.length == 2) {
                sort(input);
            } else if (input.length == 3){
                search(input);
            } else {
                Terminal.printError("No valid command.");
            }
            
            
         
          s = Terminal.readLine();
            
        }
    }

    /**
     * Syntax: search array number
     * array Syntax: x,y,z,...
     * 
     */
    private void search(String[] input) {
        if (!input[0].equals("search")) {
            Terminal.printError("No valid command.");
            return;
        }
        
        int[] array;
        int element;
        try {
            array = parseArray(input[1]);
            element = Integer.valueOf(input[2]);
        } catch (NumberFormatException e) {
            Terminal.printError("Wrong argument");
            return;
        }
        
        BinarySearch search = new BinarySearch(sort.sortAsc(array));
        Terminal.printLine(search.search(element));
        
    }

    /**
     * Syntax: sortDesc x,y,z,....
     *         sortAsc x,y,z,....
     *
     */
    private void sort(String[] input) {
        int[] arg;
        try {
            arg = parseArray(input[1]);
        } catch (NumberFormatException e) {
            Terminal.printError("Wrong argument");
            return;
        }
        
        switch(input[0]) {
        case "sortAsc":
            Terminal.printLine(Arrays.toString(sort.sortAsc(arg)));
            break;
        
        case "sortDesc":
            Terminal.printLine(Arrays.toString(sort.sortDesc(arg)));
         break;
         
        default:
            Terminal.printError("No valid command.");
      }
    }

    

    private int[] parseArray(String string) {
        String[] numbers = string.split(",");
        int [] returnArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            returnArray[i] = Integer.parseInt(numbers[i]);
        }
        return returnArray;
    }

}
