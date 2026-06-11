/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description Counting Valleys - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/counting-valleys/problem}
 */
//---------- functions ----------
/**
 * Counts the number of valleys in a hiking trail.
 * @param {number} steps - The number of steps in the trail.
 * @param {string} path - A string representing the trail, where 'U' indicates an uphill step and 'D' indicates a downhill step.
 * @returns {number} - The number of valleys in the trail.
 */
function countingValleys(steps: number, path: string): number 
{
    let starts = path[0], last = "";
    let sealvl = path[0] === "D" ? -1 : 1;
    let valleys = 0;
    
    for(let i = 1; i < steps; i++)
    {
        if(path[i] === "D")
        { sealvl--; }
        else
        { sealvl++; }
        last = path[i];
        
        if(sealvl === 0 && starts === "D" && last === "U")
        { valleys++; starts = path[i+1]; last = ""; i++; sealvl = path[i] === "D" ? -1 : 1; }
        else if(sealvl === 0 && starts === "U" && last === "D")
        { starts = path[i+1]; last = ""; i++; sealvl = path[i] === "D" ? -1 : 1; }
    }//end for

    return(valleys);
}//end countingValleys()