package edu.kit.informatik.task2;

/**
 * 
 * @author christian
 *
 */
public class BinomialImplementation implements Binomial {

    @Override
    public int binomRek(int n, int k) throws IllegalArgumentException {
        if(k < 0) {
            throw new IllegalArgumentException("Argument k has to be a non negative integer.");
        } else if (n < k) {
            throw new IllegalArgumentException("Argument k has to be lower than n.");
        } else if(k == 0 || n == k) {
            return 1;
        } else {
            return binomRek(n - 1, k - 1) + binomRek(n - 1, k);
        }
        
    }

    @Override
    public long binom(int n, int k) throws IllegalArgumentException {
        if (n < k) {
            throw new IllegalArgumentException("Argument k has to be lower than n.");
        }
        return fac(n) / (fac(n - k) * fac(k));
    }
    
    private long fac(long n) throws IllegalArgumentException {
        if(n < 0) {
            throw new IllegalArgumentException("Faculty defined for numbers >= 0 only.");
        } else if(n == 1 || n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

}
