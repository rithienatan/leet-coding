/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description Diagonal Difference - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/diagonal-difference/problem}
 */
//---------- functions ----------
/**
 * Calculates the absolute difference between the sums of the diagonals of a square matrix.
 * @param {number[][]} arr - The square matrix.
 * @returns {number} The absolute difference between the sums of the diagonals.
 */
function diagonalDifference(arr: number[][]): number 
{
    let leftToRight = 0;
    let rightToLeft = 0;
    
    //sum left-to-right
    for(let i = 0; i < arr.length; i++)
    { leftToRight += arr[i][i]; }
    
    //sum right-to-left
    for(let i = 0, j = arr.length - 1; i < arr.length; i++, j--)
    { rightToLeft += arr[i][j]; }
    
    return(Math.abs(leftToRight - rightToLeft));
}//end diagonalDifference()