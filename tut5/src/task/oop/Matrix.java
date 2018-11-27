package task.oop;

/**
 * 
 * This class represents an matrix.
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
        
        //TODO
        
        createMatrix();
        
    }
    
    private void createMatrix() {
        //TODO
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
        
        //TODO
        
    }
    
    /**
     * 
     * calculates the sum of all Matrix elements
     *
     * @return sum of elements
     */
    public long getSum() {
        
        //TODO
        
        return 0;
    }
    
    
    private long sumArray(int[] array) {
        
        //TODO
        
        return 0;
        
    }
    
    /**
     * 
     * adds another matrix to the matrix
     * 
     * @param addMatrix the matrix which will be added to the matrix
     */
    public void addMatrix(Matrix addMatrix) {
        
        //TODO
        
    }
    
}
