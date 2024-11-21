import org.junit.jupiter.api.Test;
import com.jwetherell.algorithms.mathematics.Multiplication;
import org.junit.jupiter.api.Assert.assertFalse;
import org.junit.jupiter.api.Assert.assertTrue;
import java.util.*;

public class MultiplicationTest {

    private static final int MIN = 1;
    private static final int MAX = 1000;

    private static final Random RANDOM = new Random();

    private static int nextRandomInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }

    @Test
    public void multiplication() {
        int a = Math.abs(nextRandomInt(MIN, MAX));
        int b = Math.abs(nextRandomInt(MIN, MAX));
        {
            long result = Multiplication.multiplyUsingLoop(a, b);
            long check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using a loop. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingRecursion(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using recursion. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingShift(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using shifts. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingLogs(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using logs. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Integer.parseInt(Multiplication.multiplyUsingFFT(Integer.toString(a), Integer.toString(b)));
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using FFT. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Integer.parseInt(Multiplication.multiplyUsingLoopWithStringInput(Integer.toString(a), Integer.toString(b)));
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using loop with string input. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingLoopWithIntegerInput(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using loop with int input. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));
        }
        // negative * positive
        a *= -1;
        {
            long result = Multiplication.multiplyUsingLoop(a, b);
            long check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using a loop. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingRecursion(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using recursion. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingShift(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using shifts. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingLogs(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using logs. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Integer.parseInt(Multiplication.multiplyUsingFFT(Integer.toString(a), Integer.toString(b)));
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using FFT. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Integer.parseInt(Multiplication.multiplyUsingLoopWithStringInput(Integer.toString(a), Integer.toString(b)));
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using loop with string input. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingLoopWithIntegerInput(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using loop with int input. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));
        }
        // positive * negative
        a *= -1;
        b *= -1;
        {
            long result = Multiplication.multiplyUsingLoop(a, b);
            long check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using a loop. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingRecursion(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using recursion. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingShift(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using shifts. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingLogs(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using logs. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Integer.parseInt(Multiplication.multiplyUsingFFT(Integer.toString(a), Integer.toString(b)));
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using FFT. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Integer.parseInt(Multiplication.multiplyUsingLoopWithStringInput(Integer.toString(a), Integer.toString(b)));
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using loop with string input. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingLoopWithIntegerInput(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using loop with int input. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));
        }
        // negative * negative
        a *= -1;
        {
            long result = Multiplication.multiplyUsingLoop(a, b);
            long check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using a loop. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingRecursion(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using recursion. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingShift(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using shifts. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingLogs(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using logs. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Integer.parseInt(Multiplication.multiplyUsingFFT(Integer.toString(a), Integer.toString(b)));
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using FFT. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Integer.parseInt(Multiplication.multiplyUsingLoopWithStringInput(Integer.toString(a), Integer.toString(b)));
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using loop with string input. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));

            result = Multiplication.multiplyUsingLoopWithIntegerInput(a, b);
            check = Multiplication.multiplication(a, b);
            assertTrue("Multiplication using loop with int input. a=" + a + " b=" + b + " result=" + result + " check=" + check, (result == check));
        }
    }
}
