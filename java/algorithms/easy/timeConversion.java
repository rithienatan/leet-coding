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
     * Converts a time in 12-hour AM/PM format to military (24-hour) time.
     * @param {string} s
     * @return {string}
     */
    public static String timeConversion(String s) 
    {
        int hour = Integer.parseInt(s.substring(0, 2));
        String minute = s.substring(3, 5);
        String second = s.substring(6, 8);
        String period = s.substring(8);

        if (period.equals("AM"))
        {
            if (hour == 12)
            { hour = 0; }
        }
        else
        {
            if (hour != 12) 
            { hour += 12; }
        }//end if

        return (String.format("%02d:%s:%s", hour, minute, second));
    }//end timeConversion()
}//end class