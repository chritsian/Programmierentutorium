package task.oop.solution;

/**
 * 
 * This class represents a matrix.
 * 
 * @author christian
 *
 */
public class Matrix {

    private int[][] matrix;
    private int columns;
    private int rows;
    
    public Matrix(int columns, int rows) {
        //error handling avoided
        if (columns < 1 || rows < 1) {
            this.matrix = new int[1][1];
        }
        this.matrix = new int[columns][rows];
        this.rows = rows;
        this.columns = columns;
        createMatrix();
    }
    
    private void createMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10.0);
            }
        }
    }

    /**
     * 
     * replaces an actual matrix field with a new value
     * 
     */
    public void setEntry(int row, int column, int value) {
        this.matrix[row][column] = value;
    }

    
    //getter
    
    public int getEntry(int row, int column) {
        return matrix[row][column];
    }
    
    public int getColumns() {
        return columns;
    }
    
    public int getRows() {
        return rows;
    }
        
    /**
     * prints the matrix at the console
     */
    public void print() {
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
    
    /**
     * 
     * calculates the sum of all Matrix elements
     *
     * @return sum of elements
     */
    public long getSum() {
        long matrixSum = 0;
        for (int[] element : matrix) {
            matrixSum += sumArray(element);
        }
        return matrixSum;
    }
    
    
    private long sumArray(int[] array) {
        long sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
        
    }
    
    /**
     * 
     * adds another matrix to the matrix
     * 
     * @param addMatrix the matrix which will be added to the matrix
     */
    public void addMatrix(Matrix addMatrix) {
        
        if (!(addMatrix.getColumns() == this.columns 
            && addMatrix.getRows() == this.rows)) {
            return;
        }
        
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix[i][j] += addMatrix.getEntry(i, j);
            }
        }
        
    }
    
}
