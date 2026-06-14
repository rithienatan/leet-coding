/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-06-14
 * Last modified: 2026-06-14
 * @description Dynamic Array - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/dynamic-array/problem}
 */
//---------- functions ----------
/**
 * Process a list of queries on a dynamic array and return the results.
 * 
 * @param {number} n 
 * @param {number[][]} queries 
 * 
 * @returns {number[]}
 */
function dynamicArray(n: number, queries: number[][]): number[]
{
    let lastAnswer: number = 0;
    let ans: number[] = new Array();
    
    let arr: Array<Array<number>> = new Array(n);
    for(let i = 0; i < arr.length; i++)
    { arr[i] = new Array(); }
    
    for(let i = 0; i < queries.length; i++)
    {
        if(queries[i][0] === 1)
        { arr[(queries[i][1] ^ lastAnswer) % n].push(queries[i][2]); }
        else
        {
            let idx = (queries[i][1] ^ lastAnswer) % n;
            lastAnswer = arr[idx][queries[i][2] % arr[idx].length];
            ans.push(lastAnswer);
        }//end if
    }//end for
    
    return(ans);
}//end dynamicArray()