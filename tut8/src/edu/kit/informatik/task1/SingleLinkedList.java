package edu.kit.informatik.task1;


public class SingleLinkedList<T extends Number> implements StandardList<T> {
     
    // attributes

    private ListElement<T> head;
    
    //constructor 
    
    public SingleLinkedList() {
        head = null;
    }
    
    //required methods
    
    public void addFirst(T i) {
        ListElement<T> temp = new ListElement<T>(i, head);
        head = temp;   
    }
    
    
    public void remove(T i) {
        if (head == null) {
            return;
        }
        while (head.getContent() == i) {
            head = head.getNext();
        }
        ListElement<T> l = head;
        while (l.getNext() != null) {
            if (l.getNext().getContent() == i) {
                l.setNext(l.getNext().getNext());
            }
            if (l.getNext() != null) {
                l = l.getNext();
            }
        }
        if (l.getContent() == i) {
            head = null;
        }
    }
    
    public boolean contains(T i) {
        ListElement<T> l = head;
        while (l != null) {
            if (l.getContent() == i) {
                return true;
            }
            l = l.getNext();
        }
        return false;
    }
    
    public String toString() {
        ListElement<T> l = head;
        String s = "";
        while (l != null) {
            s = s + l.getContent() + " ";
            l = l.getNext();
        }
        return s;
    }
    
    
    
    // optional task
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addLast(T i) {
        ListElement<T> l = head;
        while (l.getNext() != null) {
            l = l.getNext();
        }
        l.setNext(new ListElement<T>(i, null));
    }
    
    public T get(int i) {
        ListElement<T> l = head;
        for (int j = 0; j < i; j++) {
            l = l.getNext();
        }
        return l.getContent();
    }
    
    // methods from slides
    
    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
        }
    }
    
    public int size() {
        int i = 0;
        ListElement<T> l = head;
        while (l != null) {
            i++;
            l = l.next;
        }
        return i;
    }
    
    public void removeLast() {
        if (head.next == null) {
            head = null;
        } else {
            ListElement<T> l = head;
            for (int j = 0; j < size() - 2; j++) { 
                l = l.getNext();
            }
            l.setNext(null);
        }
    }
    
    public T popFirst() {
        if (head != null) {
            T temp = head.getContent();
            head = head.next;
            return temp;
        } else {
            return null;
        }
    }
    
    public T popLast() {
        if (head != null) {
            ListElement<T> l = head;
            while (l.next != null) {
                l = l.getNext();
            }
            T temp = l.getContent();
            removeLast();
            return temp;
        } else {
            return null;
        }
    }
    
    
    //NESTED CLASSES
    
 //section List Element
    
   private class ListElement<ElementType> {
        
        private ElementType content;
        private ListElement<ElementType> next;
        
        public ListElement(ElementType content, ListElement<ElementType> next) {
            this.content = content;
            this.next = next;
        }

        public ElementType getContent() {
            return content;
        }

        public ListElement<ElementType> getNext() {
            return next;
        }

        public void setNext(ListElement<ElementType> next) {
            this.next = next;
        }

    }
    
    //section iterator
    
    public ListIterator getIterator() {
        return new ListIterator(head);
    }
    
    public class ListIterator {
        
        private ListElement<T> current;
        
        private ListIterator(ListElement<T> start) {
            current = start;
        }
        
        public boolean hasNext() {
            return current != null;
        }
        
        public T next() {
            T temp = current.getContent();
            current = current.getNext();
            return temp;
        }
    }
    
}
