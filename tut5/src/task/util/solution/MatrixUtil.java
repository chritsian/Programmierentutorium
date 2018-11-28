package task.util.solution;

public class MatrixUtil {
    
    private MatrixUtil() {
        
    }
    
    public static int[][] createRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10.0);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        String matrixPrint = "Matrix: \n";
        int columns = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < columns; j++) {
                matrixPrint += matrix[i][j] + " ";
            }
            matrixPrint += "\n";
        }
        System.out.println(matrixPrint);
    }

    public static long sum(int[] data) {
        long sum = 0;
        for (int element : data) {
            sum += element;
        }
        return sum;
    }

    public static long matrixSum(int[][] matrix) {
        long matrixSum = 0;
        for (int[] element : matrix) {
            matrixSum += sum(element);
        }
        return matrixSum;
    }

    public static int[][] addMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int rows = firstMatrix.length;
        int columns = firstMatrix[0].length;
        int[][] result  = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return result;
    }

}
