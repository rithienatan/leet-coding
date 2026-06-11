/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-04-09
 * Last modified: 2026-06-11
 * @description Solve Me First - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/solve-me-first/problem}
 */
//---------- functions ----------
/**
 * Soolve Me First function that takes two integers and returns their sum.
 * 
 * @param {number} a
 * @param {number} b 
 * @returns {number} sum of a and b.
 * @throws {Error} If a or b are not within the range of 1 to 1000.
 */
function solveMeFirst(a: number, b: number): number
{ 
    if (a <= 0 || b <= 0 || a > 1000 || b > 1000)
    { throw new Error("Input values must be between 1 and 1000."); }

    return a + b; 
}//end solveMeFirst()