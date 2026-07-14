/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-07-13
 * Last modified: 2026-07-13
 * @description Apple and Orange - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/apple-and-orange/problem}
 */
//---------- functions ----------
/**
 * Counts the number of apples and oranges that fall on Sam's house.
 * 
 * @param {number} s
 * @param {number} t
 * @param {number} a
 * @param {number} b
 * @param {number[]} apples
 * @param {number[]} oranges
 */
function countApplesAndOranges(s: number, t: number, a: number, b: number, apples: number[], oranges: number[]): void 
{
    let countApples = 0, countOranges = 0;
    
    for(const apple of apples)
    { 
        let reach = a + apple;
        if(s <= reach && reach <= t)
        { countApples++; }   
    }//end for
    
    for(const orange of oranges)
    { 
        let reach = b + orange;
        if(s <= reach && reach <= t)
        { countOranges++; }
    }//end for
    
    console.log(countApples);
    console.log(countOranges);
}//end countApplesAndOranges()