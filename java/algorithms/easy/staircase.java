/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-13
 * Last modified: 2026-06-13
 * @description Staircase - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/staircase/problem}
 */
//---------- solution ----------
class Result
{
    /**
     * Print a staircase of size n using # symbols and spaces.
     * @param {int} n
     */
    public static void staircase(int n)
    {
        for (int i = 1; i <= n - 1; i++)
        { System.out.println(" ".repeat(n - i) + "#".repeat(i)); }

        System.out.println("#".repeat(n));
    }//end staircase()
}//end class