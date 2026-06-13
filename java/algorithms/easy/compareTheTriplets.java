/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-13
 * Last modified: 2026-06-13
 * @description Compare the Triplets - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/compare-the-triplets/problem}
 */
//---------- Imports ----------
import java.util.List;
import java.util.ArrayList;


//---------- solution ----------
class Result
{
    /**
     * Complete the 'compareTriplets' function below.
     * @param {List<Integer>} a
     * @param {List<Integer>} b
     * 
     * @return {List<Integer>}
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {
        List<Integer> results = new ArrayList<Integer>(List.of(0, 0));

        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) > b.get(i))
            { results.set(0, results.get(0) + 1); }
            else if (a.get(i) < b.get(i))
            { results.set(1, results.get(1) + 1); }
        }//end for

        return(results); 
    }//end compareTriplets()

}//end class