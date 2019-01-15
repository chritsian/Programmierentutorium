package edu.kit.informatik.solution;

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
     */
    public List<String> read() throws FileSizeException {
        
        BufferedReader reader = null;
        List<String> list = new ArrayList<String>(); 
        
       try {
           
           reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + path));
           
           int count = 0;
           String s;
           do {
               s = reader.readLine();
               list.add(s);
               if(count > 4) {
                   throw new FileSizeException();
               }
               count++;
           } while (reader.ready());
           
       } catch(FileNotFoundException e) {
           Terminal.printError("file not found");
           
       } catch (IOException e) {
           Terminal.printError("while reading file");
           
       } finally {
               try {
                   if (reader != null) {
                       reader.close();
                   }
               } catch (IOException e) {
                   e.printStackTrace();
                   
               //} catch (NullPointerException e) { //better do this with if, why?
               //    e.printStackTrace();
               }
                    
       }
       
       
       return list;
        
    }

}
