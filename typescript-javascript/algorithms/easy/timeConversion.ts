/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description Time Conversion - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/time-conversion/problem}
 */
//---------- functions ----------
/**
 * Converts a time from 12-hour format to 24-hour format.
 * @param {string} s - The time in 12-hour format.
 * @returns {string} - The time in 24-hour format.
 */
function timeConversion(s: string): string 
{
    let converted: string = "";
    let time: string[] = s.split(":");
    
    if(time[0] === "12")
    { time[0] = time[0].replace("12", "00"); }
    
    if(s.includes("PM") === true)
    { converted = String(parseInt(time[0], 10) + 12) + ":" + time[1] + ":" + time[2].replace("PM", ""); }
    else
    { converted = time[0] + ":" + time[1] + ":" + time[2].replace("AM", ""); }
    
    return(converted);
}//end timeConversion()