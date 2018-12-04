package task.solution;

public class Main {


       //add method should work for other test cases
    
       public static void main(String args[]) {
           
          SingleLinkedList list = new SingleLinkedList();
          
          
          //isEmpty an contains
          
          System.out.println("Is empty and contains test:");
          System.out.println(!list.contains(5)); 
          System.out.println(list.isEmpty()); 
          
          list.addFirst(5);
          list.addFirst(4);
          list.addFirst(23);
          
          System.out.println(!list.isEmpty()); 
          System.out.println(list.contains(5)); 
          
          list.addLast(3);
          list.addLast(5);
          
          System.out.println(!list.isEmpty() + "\n");
          
          
          
          //toString test
          
          System.out.println("toString test:");
          
          System.out.println(list.toString().equals("23 4 5 3 5 ") + "\n"); 
          
          
          
          //get test
          
          System.out.println("get test:");
          
          System.out.println((list.get(3) == 3) + "\n"); 
          
          
          //remove tests
          
          System.out.println("remove test:");
           
          list.remove(5);
           
          System.out.println(list.size() == 3); 
          
          System.out.println(list.toString().equals("23 4 3 ")); 
           
           
          list.removeFirst(); 
          
          System.out.println(list.toString().equals("4 3 ")); 
          
          list.removeLast();
           
          System.out.println(list.toString().equals("4 ") + "\n");
          
          

          //Pop tests
          
          list.addFirst(5);
          list.addFirst(4);
          list.addFirst(233);
          list.addFirst(51);
          list.addFirst(24);
          list.addFirst(2);
         
          
          System.out.println("pop test:");
          System.out.println(list.popFirst() == 2); 
          System.out.println(list.popLast() == 4); 
          System.out.println(list.popFirst() == 24); 
          
          System.out.println(list.popLast() == 5); 
          System.out.println(list.popLast() == 4); 
          System.out.println(list.popLast() == 233); 
          System.out.println(list.popLast() == 51); 
          
          
       }
       
       
}
