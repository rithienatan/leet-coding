/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-04-24
 * Last modified: 2026-06-11
 * @description Simple Array Sum - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/simple-array-sum/problem}
 */
//---------- imports ----------
import java.util.*;


//---------- solution ----------
class Result
{

    /**
     * Complete the 'simpleArraySum' function below.
     * 
     * @param {List<Integer>} The function accepts INTEGER_ARRAY ar as parameter.
     * @return The function is expected to return an INTEGER.
     */

    public static int simpleArraySum(List<Integer> ar) 
    { return (ar.stream().reduce(0, Integer::sum)); }
}//end class