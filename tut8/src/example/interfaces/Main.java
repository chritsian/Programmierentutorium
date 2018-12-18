package example.interfaces;


public final class Main {

    
    public static void main(String[] args) {
        
        ImplementingClassSub sub = new ImplementingClassSub();
        sub.specialMethod();
        sub.anotherMethod();
        
        SubInterface subInterface = new ImplementingClassSub();
        subInterface.anotherGeneralMethod();
        //subInterface.anotherMethod(); //isn't working, why?
        
        SuperInterface sup = new ImplementingClassSuper();
        sup.anotherGeneralMethod();
        
        ImplementingClassSuper supClass = new ImplementingClassSuper();
        
        
    }

}
