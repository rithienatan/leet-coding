/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-07-13
 * Last modified: 2026-07-13
 * @description Apple and Orange - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/apple-and-orange/problem}
 */
//---------- Imports ----------
import java.util.*;


//---------- solution ----------
class Result 
{
    /**
     * Counts the number of apples and oranges that fall on Sam's house.
     * 
     * @param {int} s
     * @param {int} t
     * @param {int} a
     * @param {int} b
     * @param {int[]} apples
     * @param {int[]} oranges
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges)
    {
        int countApples = 0;
        int countOranges = 0;

        for(int apple: apples)
        {
            int reach = a + apple;
            if(s <= reach && reach <= t)
            { countApples++; }
        }//end for

        for(int orange: oranges)
        {
            int reach = b + orange;
            if(s <= reach && reach <= t)
            { countOranges++; }
        }//end for

        System.out.println(countApples);
        System.out.println(countOranges);
    }//end countApplesAndOranges()
}//end class