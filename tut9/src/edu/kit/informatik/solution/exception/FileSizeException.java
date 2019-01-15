package edu.kit.informatik.solution.exception;

public class FileSizeException extends Exception {
    
    private static final long serialVersionUID = 1L;
    
    private static final String message = "File is too long, maximum file size = 5 lines";

    public FileSizeException() {
        super();
    }
    
    
    @Override
    public String getMessage() {
        return message;
    }

}
