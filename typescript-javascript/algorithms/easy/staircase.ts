/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description Staircase - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/staircase/problem}
 */
//---------- functions ----------
/**
 * Prints a staircase of given size.
 * @param {number} n - The size of the staircase.
 */
function staircase(n: number): void
{
    for(let i = 1; i <= n-1; i++)
    { console.log(" ".repeat(n-i) + "#".repeat(i)); }
    
    console.log("#".repeat(n));
}//end staircase()