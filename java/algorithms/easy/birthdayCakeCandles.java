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
     * Counts how many candles are tallest.
     * 
     * @param {List<Integer>} candles
     * @return {int}
     */
    public static int birthdayCakeCandles(List<Integer> candles) 
    { 
        int count = 1;
        candles.sort((a, b) -> b - a);
        int lastNumber = candles.get(0);        

        for (int i = 1; i < candles.size(); i++)
        {
            if (lastNumber == candles.get(i))
            { count++; }
            else
            { break; }
        }//end for

        return(count);
    }//end birthdayCakeCandles()
}//end class