package edu.kit.informatik.task1;

import edu.kit.informatik.terminal.Terminal;

public class Main {


       //add method should work for other test cases
    
       public static void main(String args[]) {
           
          SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
          
          
          //isEmpty an contains
          
          Terminal.printLine("Is empty and contains test:");
          Terminal.printLine(!list.contains(5)); 
          Terminal.printLine(list.isEmpty()); 
          
          list.addFirst(5);
          list.addFirst(4);
          list.addFirst(23);
          
          Terminal.printLine(!list.isEmpty()); 
          Terminal.printLine(list.contains(5)); 
          
          list.addLast(3);
          list.addLast(5);
          
          Terminal.printLine(!list.isEmpty() + "\n"); 
          //toString test
          
          Terminal.printLine("toString test:");
          
          Terminal.printLine(list.toString().equals("23 4 5 3 5 ") + "\n"); 
          
          
          
          //get test
          
          Terminal.printLine("get test:");
          
          Terminal.printLine((list.get(3) == 3) + "\n"); 
          
          
          //remove tests
          
          Terminal.printLine("remove test:");
           
          list.remove(5);
           
          Terminal.printLine(list.size() == 3); 
          
          Terminal.printLine(list.toString().equals("23 4 3 ")); 
           
           
          list.removeFirst(); 
          
          Terminal.printLine(list.toString().equals("4 3 ")); 
          
          list.removeLast();
           
          Terminal.printLine(list.toString().equals("4 ") + "\n");
          
          

          //Pop tests
          
          list.addFirst(5);
          list.addFirst(4);
          list.addFirst(233);
          list.addFirst(51);
          list.addFirst(24);
          list.addFirst(2);
         
          
          Terminal.printLine("pop test:");
          Terminal.printLine(list.popFirst() == 2); 
          Terminal.printLine(list.popLast() == 4); 
          Terminal.printLine(list.popFirst() == 24); 
          
          Terminal.printLine(list.popLast() == 5); 
          Terminal.printLine(list.popLast() == 4); 
          Terminal.printLine(list.popLast() == 233); 
          Terminal.printLine(list.popLast() == 51); 
          
          
       }
       
       
}
