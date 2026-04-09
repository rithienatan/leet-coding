/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-04-09
 * Last modified: 2026-04-09
 * @description Solve Me First - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/solve-me-first/problem}
 */
//---------- basics for tests ----------
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');
let inputString: string = '';
let inputLines: string[] = [];
let currentLine: number = 0;
process.stdin.on('data', function(inputStdin: string): void {
    inputString += inputStdin;
});

process.stdin.on('end', function(): void {
    inputLines = inputString.split('\n');
    inputString = '';
    main();
});

function readLine(): string {
    return inputLines[currentLine++];
}


//---------- functions ----------
/**
 * 
 * @param {number} a
 * @param {number} b 
 * @returns {number} sum of a and b.
 * @throws {Error} If a or b are not within the range of 1 to 1000.
 */
function solveMeFirst(a: number, b: number): number
{ 
    if (a <= 0 || b <= 0 || a > 1000 || b > 1000)
    { throw new Error("Input values must be between 1 and 1000."); }

    return a + b; 
}//end solveMeFirst()


//---------- Main ----------
/**
 * The main function to test other kind of inputs.
 */
function main() {
    let a = parseInt(readLine());
    let b = parseInt(readLine());;

    let res = solveMeFirst(a, b);
    console.log(res);
}