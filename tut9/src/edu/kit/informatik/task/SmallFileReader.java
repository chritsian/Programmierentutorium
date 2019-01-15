package edu.kit.informatik.task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.kit.informatik.Terminal;
import edu.kit.informatik.solution.exception.FileSizeException;


/**
 * 
 * A simple File Reader for .txt files
 * 
 * @author christian
 *
 */
public class SmallFileReader {
    
    private String path;
    
    /**
     * 
     * @param path to the file you want to read
     */
    public SmallFileReader(String path) {
        this.path = path;
    }
    
    /**
     * The array represents the lines of the file
     * 
     * @return file content
     * @throws IOException 
     */
    public List<String> read() throws FileSizeException {
        
        BufferedReader reader = null;
        List<String> list = new ArrayList<String>(); 
        
       //TODO implement
     
       
       return list;
        
    }

}
