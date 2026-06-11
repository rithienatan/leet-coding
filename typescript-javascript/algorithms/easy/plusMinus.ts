/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description Plus Minus - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/plus-minus/problem}
 */
//---------- functions ----------
/**
 * Calculates and prints the ratios of positive, negative, and zero elements in an array.
 * @param {number[]} arr - The array of integers.
 */
function plusMinus(arr: number[]): void 
{
    let plusList = arr.filter((el) => el > 0);
    let minusList = arr.filter((el) => el < 0);
    let zerosList = arr.filter((el) => el === 0);
    
    console.log(plusList.length/arr.length);
    console.log(minusList.length/arr.length);
    console.log(zerosList.length/arr.length);
}//end plusMinus()