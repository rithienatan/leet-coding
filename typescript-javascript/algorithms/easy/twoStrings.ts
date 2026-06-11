/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-05-19
 * Last modified: 2026-06-11
 * @description Two Strings - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/two-strings/problem}
 */
//---------- functions ----------
/**
 * Determines if two strings share a common substring.
 * @param {string} s1 - The first string.
 * @param {string} s2 - The second string.
 * @returns {string} - "YES" if the strings share a common substring, "NO" otherwise.
 */
function twoStrings(s1: string, s2: string): string 
{
    let haveCommun = "NO";
    let hashString: Map<string, number> = new Map();
    
    for(let i = 0; i < s1.length; i++)
    {
        if(hashString.has(s1[i]) === false)
        { hashString.set(s1[i], 1); }
    }//end for
    
    for(let i = 0; i < s2.length; i++)
    {
        if(hashString.has(s2[i]) === true)
        { haveCommun = "YES"; break; }
    }//end for
    
    return(haveCommun);
}//twoStrings()