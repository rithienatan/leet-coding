/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-07-13
Last modified: 2026-07-13
Description: 2D Array - DS - HackerRank
See: https://www.hackerrank.com/challenges/2d-array/problem
*/
//--------- package ---------
package easy


//--------- functions ---------
// hourglassSum - Calculates the maximum hourglass sum in a 2D array.
func hourglassSum(arr [][]int32) int32 {
	var maxSum int32 = -99;
	var R int32 = 6;
	var C int32 = 6;

	for i := int32(0); i < R-2; i++ {
		for j := int32(0); j < C-2; j++ {
			sum := arr[i][j] + arr[i][j+1] + arr[i][j+2] +
				arr[i+1][j+1] +
				arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

			if sum > maxSum {
				maxSum = sum;
			}
		}//end for
	}//end for

	return maxSum;
}//end hourglassSum()