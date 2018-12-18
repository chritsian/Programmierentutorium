package edu.kit.informatik.task1;


public interface StandardList<T extends Number> {
    
    void addFirst(T t);
    void remove(T t);
    boolean contains(T t);
    String toString();
       
}
