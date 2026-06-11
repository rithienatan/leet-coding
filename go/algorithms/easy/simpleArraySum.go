/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-04-25
Last modified: 2026-06-11
Description: Simple Array Sum - HackerRank
See: https://www.hackerrank.com/challenges/simple-array-sum/problem
*/
//--------- package ---------
package main


//--------- functions ---------
/**
 * Complete the 'simpleArraySum' function below.
 *
 * @ar: The function accepts INTEGER_ARRAY ar as parameter.
 * @return: The function is expected to return an INTEGER.
 */

func simpleArraySum(ar []int32) int32 {
	var sum int32 = 0;

	for _, value := range ar {
		sum += value;
	}

	return sum;
}//end simpleArraySum()