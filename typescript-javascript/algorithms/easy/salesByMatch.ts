/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-13
 * @description Sales by Match - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/sales-by-match/problem}
 */
//---------- functions ----------
/**
 * Finds the number of pairs of socks with matching colors.
 * @param {number} n - The number of socks in the pile.
 * @param {number[]} ar - The colors of each sock.
 * @returns {number} - The number of pairs of socks.
 */
function sockMerchant(n: number, ar: number[]): number
{
    let countPair = 0;
    
    ar.sort((a, b) => a - b);
    
    for(let i = 0, j = 1; i < n-1; i++, j++)
    {
        if(ar[i] === ar[j])
        { countPair++; i += 1; j += 1; }
    }//end for
    
    return(countPair);
}//sockMerchant()