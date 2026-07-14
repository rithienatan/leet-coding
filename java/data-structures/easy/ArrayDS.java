/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-07-13
 * Last modified: 2026-07-13
 * @description Array - DS - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/arrays-ds/problem}
 */
//---------- Imports ----------
import java.util.List;
import java.math.*;


//---------- solution ----------
class Result
{
    /**
     * Calculates the maximum hourglass sum in a 2D array.
     *  
     * @param {List<List<Integer>>} arr
     * @return {int} The maximum hourglass sum found in the 2D array.
     */
    public static int hourglassSum(List<List<Integer>> arr)
    {
        int maxSum = -99;
        int R = 6;
        int C = 6;

        for (int i = 0; i < R - 2; i++)
        {
            for (int j = 0; j < C - 2; j++)
            {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                maxSum = Math.max(maxSum, sum);
            }//end for  
        }//end for

        return(maxSum);
    }//end hourglassSum()
}//end class