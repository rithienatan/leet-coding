/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-14
 * Last modified: 2026-06-14
 * @description Dynamic Array - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/dynamic-array/problem}
 */
//---------- Imports ----------
import java.util.List;
import java.util.ArrayList;


//---------- solution ----------
class Result
{
    /**
     * Process a list of queries on a dynamic array and return the results.
     *  
     * @param {int} n
     * @param {List<List<Integer>>} queries
     * @return {List<Integer>}
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries)
    {
        int lastAnswer = 0;
        List<Integer> ans = new ArrayList<>();

        List<List<Integer>> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        { arr.add(new ArrayList<>()); }

        for(List<Integer> query : queries)
        {
            if(query.get(0) == 1)
            { arr.get((query.get(1) ^ lastAnswer) % n).add(query.get(2)); }
            else
            {
                int idx = (query.get(1) ^ lastAnswer) % n;
                lastAnswer = arr.get(idx).get(query.get(2) % arr.get(idx).size());
                ans.add(lastAnswer);
            }//end if
        }//end for

        return(ans);
    }//end dynamicArray()
}//end class