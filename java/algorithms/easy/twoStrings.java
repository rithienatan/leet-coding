/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-13
 * Last modified: 2026-06-13
 * @description Two Strings - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/two-strings/problem}
 */
//---------- Imports ----------
import java.util.Map;
import java.util.HashMap;


//---------- solution ----------
class Result 
{
    /**
     * Determines if two strings share a common substring.
     * 
     * @param {String} s1
     * @param {String} s2
     * @return {String}
     */
    public static String twoStrings(String s1, String s2) 
    {
        String haveCommun = "NO";
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : s1.toCharArray())
        { map.put(c, 1); }

        for (char c : s2.toCharArray())
        {
            if (map.containsKey(c))
            { haveCommun = "YES"; break; }
        }//end for

        return(haveCommun);
    }//end twoStrings()
}//end class