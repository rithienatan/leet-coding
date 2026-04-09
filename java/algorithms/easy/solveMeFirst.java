/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-04-09
 * Last modified: 2026-04-09
 * @description Solve Me First - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/solve-me-first/problem}
 */
//---------- imports ----------
import java.util.*;


//---------- solution ----------
public class solveMeFirst {

    /**
     * Sum two numbers.
     * 
     * @param a first integer
     * @param b second integer
     * @return the sum of a and b
     * @throws IllegalArgumentException if a or b is out of the range [0, 1000]
     */
    static int solveMeFirstMethod(int a, int b)
    {
        if(a < 0 || a > 1000 || b < 0 || b > 1000)
        { throw new IllegalArgumentException("Input integers must be between 0 and 1000."); }

        return(a + b);
	}//end solveMeFirst()

  
    /**
     * The main function to test other kind of inputs.
     * 
     * @param args
     */
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        in.close();
        int sum;
        sum = solveMeFirstMethod(a, b);
        System.out.println(sum);
	}
}