import java.util.HashSet;
import java.util.Set;

/**
 * purpose: to return prime factors for given number
 */
public class PrimeFactors {
    public static void main(String[] args) {
        System.out.printf( "Prime factors of number %d is: %s %n " , 35 , primeFactors( 35 ) );
    }

    public static Set<Integer> primeFactors(long number) {
        Set<Integer> primefactors = new HashSet<>();
        long copyofInput = number;
        for (int i = 2; i <= copyofInput; i++) {
            if (copyofInput % i == 0) {
                primefactors.add( i );
                copyofInput /= i;
                i--;
            }
        }
        return primefactors;
    }
}
