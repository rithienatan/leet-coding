/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description Compare the Triplets - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/compare-the-triplets/problem}
 */
//---------- functions ----------
/**
 * Compares two triplets and returns the comparison results.
 * @param {Array<number>} a 
 * @param {Array<number>} b 
 * @returns {Array<number>} returns an array with the comparison results for each triplet.
 */
function compareTriplets(a: number[], b: number[]): number[]
{
    let result: Array<number> = new Array(0, 0);
    
    for(let i = 0; i < a.length; i++)
    {
        if(a[i] > b[i])
        { result[0] += 1; }
        else if(a[i] < b[i])
        { result[1] += 1; }
    }//end for
    
    return(result);
}//end compareTriplets()