/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-15
 * Last modified: 2026-06-15
 * @description Birthday Cake Candles - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/birthday-cake-candles/problem}
 */
//---------- functions ----------
/**
 * Count how many candles are tallest in the array of candles. The tallest candles are the ones that can be blown out.
 * 
 * @param {number[]} candles 
 * @returns {number}
 */
function birthdayCakeCandles(candles: number[]): number 
{
    let count: number = 1;
    candles.sort((a, b) => b - a);
    let lastNumber: number = candles[0];
    
    for(let i = 1; i < candles.length; i++)
    {
        if(lastNumber === candles[i])
        { count++; }
        else
        { break; }   
    }
    
    return(count);
}//end birthdayCakeCandles()