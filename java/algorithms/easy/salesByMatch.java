/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-13
 * Last modified: 2026-06-13
 * @description Sales by Match - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/sales-by-match/problem}
 */
//---------- Imports ----------
import java.util.List;


//---------- solution ----------
class Result
{
    /**
     * 
     * @param {int} n
     * @param {List<Integer>} ar
     * @return {int}
     */
    public static int sockMerchant(int n, List<Integer> ar)
    {
        int countPairs = 0;

        ar.sort(null);

        for(int i = 0; i < n - 1; i++)
        {
            if(ar.get(i).equals(ar.get(i + 1)))
            { countPairs++; i++; }
        }//end for

        return(countPairs);
    }//end sockMerchant()
}//end class