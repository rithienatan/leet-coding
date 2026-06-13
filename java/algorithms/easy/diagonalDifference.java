/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-13
 * Last modified: 2026-06-13
 * @description Compare the Triplets - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/compare-the-triplets/problem}
 */
//---------- Imports ----------
import java.util.List;


//---------- solution ----------
class Result
{
    /**
     * Difference between the sums of the matrix diagonals.
     *
     * @param {List<List<Integer>>} arr
     * @return {int}
     */
    public static int diagonalDifference(List<List<Integer>> arr)
    {
        Integer leftToRight = 0, rightToLeft = 0;

        // sum left to right diagonal
        for (int i = 0; i < arr.size(); i++) 
        { leftToRight += arr.get(i).get(i); }

        // sum right to left diagonal
        for (int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--) 
        { rightToLeft += arr.get(i).get(j); }

        return Math.abs(leftToRight - rightToLeft);
    }//end diagonalDifference()
}//end class