/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-07-13
 * Last modified: 2026-07-13
 * @description Array - DS - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/arrays-ds/problem}
 */
//---------- Imports ----------
import java.util.List;
import java.util.Collections;


//---------- solution ----------
class Result
{
    /**
     * Reverses the elements of an array.
     *  
     * @param {List<Integer>} a
     * @return {List<Integer>} The reversed array.
     */
    public static List<Integer> reverseArray(List<Integer> a)
    {
        Collections.reverse(a);
        return(a);
    }//end reverseArray()
}//end class