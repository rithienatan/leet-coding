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
     * Calculates the ratios of positive, negative and zero values in the given list and prints them with 6 decimal places.
     * @param {List<Integer>} arr
     */
    public static void plusMinus(List<Integer> arr)
    {
        Integer plusList = 0, minusList = 0, zeroList = 0;

        for (Integer i : arr)
        {
            if (i > 0) { plusList++; }
            else if (i < 0) { minusList++; }
            else { zeroList++; }
        }//end for

        System.out.println(String.format("%.6f", (float) plusList / arr.size()));
        System.out.println(String.format("%.6f", (float) minusList / arr.size()));
        System.out.println(String.format("%.6f", (float) zeroList / arr.size()));
    }//end plusMinus()
}//end class