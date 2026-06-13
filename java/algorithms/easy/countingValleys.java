/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-13
 * Last modified: 2026-06-13
 * @description Counting Valleys - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/counting-valleys/problem}
 */
//---------- solution ----------
class Result
{
    /**
     * Counts the number of valleys in a given path.
     * @param {int} steps
     * @param {String} path
     * @return int - the number of valleys
     */
    public static int countingValleys(int steps, String path)
    {
        char starts = path.charAt(0), last = ' ';
        int seaLevel = (path.charAt(0) == 'D') ? -1 : 1;
        int valleys = 0;

        for(int i = 1; i < steps; i++)
        {
            if(path.charAt(i) == 'D')
            { seaLevel--; }
            else
            { seaLevel++; }
            last = path.charAt(i);

            if(seaLevel == 0 && starts == 'D' && last == 'U')
            {
                valleys++; i++; last = ' ';

                if (i <= steps - 2)
                { starts = path.charAt(i); seaLevel = (path.charAt(i) == 'D') ? -1 : 1; }
            } 
            else if(seaLevel == 0 && starts == 'U' && last == 'D')
            {
                starts = path.charAt(i); last = ' '; i++;

                if (i <= steps - 2)
                { seaLevel = (path.charAt(i) == 'D') ? -1 : 1; }
            }//end if
        }//end for

        return(valleys);
    }//end countingValleys()
}//end class