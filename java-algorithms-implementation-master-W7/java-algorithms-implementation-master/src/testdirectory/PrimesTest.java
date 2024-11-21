import org.junit.jupiter.api.Test;
import com.jwetherell.algorithms.mathematics.Primes;
import org.junit.jupiter.api.Assert.assertFalse;
import org.junit.jupiter.api.Assert.assertTrue;
import java.util.*;

public class PrimesTest {

    @Test
    public void getPrimeFactorization() {
        int number = 234;
        Map<Long, Long> factorization = Primes.getPrimeFactorization(number);
        Map<Long, Long> check = new HashMap<Long, Long>();
        {
            check.put(2l, 1L);
            check.put(3l, 2L);
            check.put(13L, 1L);
        }
        for (Long k : factorization.keySet()) {
            Long f = factorization.get(k);
            Long c = check.get(k);
            assertTrue("PrimeFactorization error. expected=" + c + " got=" + f, (c == f));
        }
    }

    @Test
    public void isPrime() {
        int number = 1234;
        boolean isPrime = Primes.isPrime(number);
        assertFalse("isPrime error. isPrime=" + isPrime, isPrime);

        number = 7919;
        isPrime = Primes.isPrime(number);
        assertTrue("isPrime error. isPrime=" + isPrime, isPrime);
    }

    @Test
    public void sieveOfEratosthenes() {
        int number = 1;
        boolean isPrime = Primes.sieveOfEratosthenes(number);
        assertFalse("Sieve Of Eratosthenes error.", isPrime);

        number = 31;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertTrue("Sieve Of Eratosthenes error.", isPrime);

        number = 64;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertFalse("Sieve Of Eratosthenes error.", isPrime);

        number = 4177;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertTrue("Sieve Of Eratosthenes error.", isPrime);

        number = 4178;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertFalse("Sieve Of Eratosthenes error.", isPrime);

        number = 7919;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertTrue("Sieve Of Eratosthenes error.", isPrime);

        number = 556;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertFalse("Sieve Of Eratosthenes error.", isPrime);

        number = 6091;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertTrue("Sieve Of Eratosthenes error.", isPrime);

        number = 6090;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertFalse("Sieve Of Eratosthenes error.", isPrime);

        number = 6089;
        isPrime = Primes.sieveOfEratosthenes(number);
        assertTrue("Sieve Of Eratosthenes error.", isPrime);
    }
}
