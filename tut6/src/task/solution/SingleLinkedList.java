package task.solution;

public class SingleLinkedList {
     
    // attributes

    private ListElement head;
    
    //constructor 
    
    public SingleLinkedList() {
        head = null;
    }
    
    //required methods
    
    public void addFirst(int i) {
        ListElement temp = new ListElement(i, head);
        head = temp;   
    }
    
    
    public void remove(int i) {
        if (head == null) {
            return;
        }
        while (head.getContent() == i) {
            head = head.getNext();
        }
        ListElement l = head;
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
    
    public boolean contains(int i) {
        ListElement l = head;
        while (l != null) {
            if (l.getContent() == i) {
                return true;
            }
            l = l.getNext();
        }
        return false;
    }
    
    public String toString() {
        ListElement l = head;
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
    
    public void addLast(int i) {
        ListElement l = head;
        while (l.getNext() != null) {
            l = l.getNext();
        }
        l.setNext(new ListElement(i, null));
    }
    
    public int get(int i) {
        ListElement l = head;
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
        ListElement l = head;
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
            ListElement l = head;
            for (int j = 0; j < size() - 2; j++) {
                l = l.getNext();
            }
            l.setNext(null);
        }
    }
    
    public int popFirst() {
        if (head != null) {
            int temp = head.getContent();
            head = head.next;
            return temp;
        } else {
            return 0;
        }
    }
    
    public int popLast() {
        if (head != null) {
            ListElement l = head;
            while (l.next != null) {
                l = l.getNext();
            }
            int temp = l.getContent();
            removeLast();
            return temp;
        } else {
            return 0;
        }
    }
    
    
    //NESTED CLASSES
    
 //section List Element
    
    private class ListElement {
        
        private int content;
        private ListElement next;
        
        public ListElement(int content, ListElement next) {
            this.content = content;
            this.next = next;
        }

        public int getContent() {
            return content;
        }

        public ListElement getNext() {
            return next;
        }

        public void setNext(ListElement next) {
            this.next = next;
        }

    }
    
    //section iterator
    
    public ListIterator getIterator() {
        return new ListIterator(head);
    }
    
    public class ListIterator {
        
        private ListElement current;
        
        private ListIterator(ListElement start) {
            current = start;
        }
        
        public boolean hasNext() {
            return current != null;
        }
        
        public int next() {
            int temp = current.getContent();
            current = current.getNext();
            return temp;
        }
    }
    
}
