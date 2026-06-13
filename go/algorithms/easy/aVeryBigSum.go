/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: A Very Big Sum - HackerRank
See: https://www.hackerrank.com/challenges/a-very-big-sum/problem
*/
//--------- package ---------
package easy


//--------- functions ---------
// Complete the aVeryBigSum function below.
func aVeryBigSum(ar []int64) int64 {
	var sum int64 = 0;

	for _, value := range ar {
		sum += value;
	}//end for

    return sum;
}//end aVeryBigSum()