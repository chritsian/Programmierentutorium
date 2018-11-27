package task.oop.main;

import task.oop.Matrix;

public class Main {

    public static void main(String[] args) {
        
        Matrix matrix = new Matrix(10, 10);
        matrix.print();
        
        
        System.out.println(matrix.getSum());
        
        
        Matrix secondMatrix = new Matrix(10, 10);
        
        matrix.print();
        secondMatrix.print();
        
        matrix.addMatrix(secondMatrix);
        
        matrix.print();
    }

}
