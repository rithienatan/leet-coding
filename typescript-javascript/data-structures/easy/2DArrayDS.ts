/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-07-13
 * Last modified: 2026-07-13
 * @description 2D Array - DS - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/2d-array/problem}
 */
//---------- functions ----------
/**
 * Calculates the maximum hourglass sum in a 2D array.
 * 
 * @param {number[][]} arr - A 2D array of integers representing the input data.
 * 
 * @returns {number} The maximum hourglass sum found in the 2D array.
 */
function hourglassSum(arr: number[][]): number 
{
    let max_sum = -99;
    let R = 6;
    let C = 6;
    
    for(let i = 0; i < R - 2; i++)
    {
        for(let j = 0; j < C - 2; j++)
        {
            let sum = (arr[i][j] + arr[i][j+1] + arr[i][j+2]) +
                      (arr[i+1][j+1]) +
                      (arr[i+2][j] + arr[i+2][j+1] +arr[i+2][j+2]);
            
            max_sum = Math.max(max_sum, sum);
        }//end for
    }//end for
    
    return(max_sum);
}//end hourglassSum()