/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-04-24
 * Last modified: 2026-06-11
 * @description Simple Array Sum - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/simple-array-sum/problem}
 */
//---------- functions ----------
/**
 * Complete the 'simpleArraySum' function below.
 *
 * @param {number[]} ar The array to sum.
 * @returns {number} The function is expected to return an INTEGER.
 */
function simpleArraySum(ar: number[]): number 
{ return (ar.reduce((a, b) => a + b)); }