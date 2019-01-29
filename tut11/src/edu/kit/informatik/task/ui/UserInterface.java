package edu.kit.informatik.task.ui;

import edu.kit.informatik.task.search.BinarySearch;
import edu.kit.informatik.task.sort.SelectionSort;
import edu.kit.informatik.task.sort.SortAlgo;

public class UserInterface {
    
    private SortAlgo sort;

    public static void main(String[] args) {
        
           UserInterface ui = new UserInterface();
           ui.start();
    
    }

    private void start() {
        sort = new SelectionSort();
        
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

    private void search(String[] input) {
        if (!input[0].equals("sort")) {
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
            Terminal.printLine(sort.sortAsc(arg));
        break;
        
        case "sortDesc":
            Terminal.printLine(sort.sortDesc(arg));
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
