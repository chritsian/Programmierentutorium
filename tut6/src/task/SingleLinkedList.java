package task;


public class SingleLinkedList {
     
    // attributes

    private ListElement head;
    
    //constructor 
    
    public SingleLinkedList() {
        head = null;
    }
    
    //required methods
    
    public void addFirst(int i) {
       
    }
    
    
    public void remove(int i) {
       
    }
    
    public boolean contains(int i) {
        return false;
        
    }
    
    public String toString() {
        return null;
        
    }
    
    
    
    // optional task
    
    public boolean isEmpty() {
        return false;
        
    }
    
    public void addLast(int i) {
       
    }
    
    public int get(int i) {
        return i;
        
    }
    
    // methods from slides
    
    public void removeFirst() {
       
    }
    
    public int size() {
        return 0;
        
    }
    
    public void removeLast() {
       
    }
    
    public int popFirst() {
        return 0;
        
    }
    
    public int popLast() {
        return 0;
       
    }
    
    
    //NESTED CLASSES
    
 //section List Element
    
    private class ListElement {
        
        private int content;
        private ListElement next;
        
        public ListElement(int content, ListElement next) {
            
            
        }

        public int getContent() {
            return content;
            
        }

        public ListElement getNext() {
            return next;
            
        }

        public void setNext(ListElement next) {
            
        }

    }
    
    //section iterator
    
    public ListIterator getIterator() {
        return null;
       
    }
    
    public class ListIterator {
        
        private ListElement current;
        
        private ListIterator(ListElement start) {
            

        }
        
        public boolean hasNext() {
            return false;
            
        }
        
        public int next() {
            return 0;
            
            
        }
    }
    
}
