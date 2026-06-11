/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description Mini-Max Sum - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/mini-max-sum/problem}
 */
//---------- functions ----------
/**
 * Calculates and prints the minimum and maximum sums of an array.
 * @param {number[]} arr - The array of numbers.
 */
function miniMaxSum(arr: number[]): void
{
    arr.sort((a, b) => a - b);
    
    const min = arr.slice(0, arr.length - 1).reduce((a, b) => a + b);
    const max = arr.slice(1, arr.length).reduce((a, b) => a + b);
    
    console.log(min + " " + max);
}//end miniMaxSum()