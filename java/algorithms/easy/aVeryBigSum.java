/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-13
 * Last modified: 2026-06-13
 * @description A Very Big Sum - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/a-very-big-sum/problem}
 */
//---------- Imports ----------
import java.util.List;


//---------- solution ----------
class Result
{
    /**
     * Complete the 'aVeryBigSum' function below.
     * @param {List<Long>} ar
     * @return {long}
     */
    public static long aVeryBigSum(List<Long> ar)
    { return(ar.stream().mapToLong(x -> x).sum()); }
}//end class