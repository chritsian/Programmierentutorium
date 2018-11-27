package task.util.main;

import task.util.MatrixUtil;

public class Main {

    public static void main(String[] args) {
        
        int[][] matrix = MatrixUtil.createRandomMatrix(4, 5);
        MatrixUtil.printMatrix(matrix);
        
        int[] test = {2, 3, 7, 334314, 45, 6};
        System.out.println(MatrixUtil.sum(test));
        //expected output: 334377
        
        System.out.println(MatrixUtil.matrixSum(matrix));
        
        
        int[][] firstMatrix = MatrixUtil.createRandomMatrix(4, 5);
        int[][] secondMatrix = MatrixUtil.createRandomMatrix(4, 5);
        
        MatrixUtil.printMatrix(firstMatrix);
        MatrixUtil.printMatrix(secondMatrix);
        
        MatrixUtil.printMatrix(MatrixUtil.addMatrix(firstMatrix, secondMatrix));
    }

}
