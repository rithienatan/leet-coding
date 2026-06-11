/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description A Very Big Sum - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/a-very-big-sum/problem}
 */
//---------- functions ----------
/**
 * Calculates the sum of all elements in an array of numbers.
 * @param {Array<number>} ar 
 * @returns {number} The sum of all elements in the array.
 */
function aVeryBigSum(ar: number[]): number
{ return(ar.reduce((a, b) => a + b)); }