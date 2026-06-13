/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: A Very Big Sum - HackerRank
See: https://www.hackerrank.com/challenges/a-very-big-sum/problem
*/
//--------- package ---------
package easy


//--------- imports ---------
import "math"


//--------- functions ---------
// diagonalDifference calculates the absolute difference between the sums of the matrix's two diagonals.
func diagonalDifference(arr [][]int32) int32 {
	var leftToRight, rightToLeft int32 = 0, 0;

	// sum left to right diagonal
	for i := 0; i < len(arr); i++ {
		leftToRight += arr[i][i];
	}

	// sum right to left diagonal
	for i, j := 0, len(arr)-1; i < len(arr); i, j = i + 1, j - 1 {
		rightToLeft += arr[i][j];
	}

	return int32(math.Abs(float64(leftToRight - rightToLeft)));
}//end diagonalDifference()