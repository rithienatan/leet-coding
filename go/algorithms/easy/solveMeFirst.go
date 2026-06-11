/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-04-09
Last modified: 2026-06-11
Description: Solve Me First - HackerRank
See: https://www.hackerrank.com/challenges/solve-me-first/problem
*/
//--------- package ---------
package main


//--------- imports ---------
import ( 
	"errors"
)


//--------- functions ---------
/**
 *   add two numbers and return the sum
 *   @a: the first integer
 *   @b: the second integer
 *   return: the sum of a and b
 *   constraints: 0 <= a,b <= 1000
 */
func solveMeFirst(a int,b int) (int, error) {
	if a < 0 || b < 0 || a > 1000 || b > 1000 {
		return 0, errors.New("Input integers must be between 0 and 1000.")
	}

    return a + b, nil;
}//end solveMeFirst()