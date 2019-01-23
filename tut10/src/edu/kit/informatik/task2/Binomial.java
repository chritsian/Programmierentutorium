package edu.kit.informatik.task2;

/**
 * Interface which defines two methods for binomial coefficient calculation.
 * 
 * @author christian
 *
 */
public interface Binomial {

     /**
      * Calculates the binomial coefficient (n k) recursively
      * @param n value for n
      * @param k
      * @return result of calculation
      */
     int binomRek(int n, int k) throws IllegalArgumentException;
     
     /**
      * Calculates the binomial coefficient (n k) with a formula
      * @param n
      * @param k
      * @return result of calculation
      */
     long binom(int n, int k) throws IllegalArgumentException;
}
