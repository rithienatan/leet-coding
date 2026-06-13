/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-13
 * Last modified: 2026-06-13
 * @description Plus Minus - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/plus-minus/problem}
 */
//---------- Imports ----------
import java.util.List;


//---------- solution ----------
class Result
{
    /**
     * Calculate the minimum and maximum sum of an array.
     * @param {List<Integer>} arr
     */
    public static void miniMaxSum(List<Integer> arr)
    {
        arr.sort(Integer::compareTo);

        long min = arr.stream().limit(arr.size() - 1).mapToLong(Integer::longValue).sum(); 
        long max = arr.stream().skip(1).mapToLong(Integer::longValue).sum();

        System.out.println(min + " " + max);
    }//end miniMaxSum()

}//end class