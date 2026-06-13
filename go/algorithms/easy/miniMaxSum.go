/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Plus Minus - HackerRank
See: https://www.hackerrank.com/challenges/plus-minus/problem
*/
//--------- package ---------
package easy

//--------- Imports ---------
import (
	"fmt"
	"slices"
)

//--------- functions ---------
// miniMaxSum calculates the minimum and maximum sum and prints them.
func miniMaxSum(arr []int32) {
	slices.Sort(arr);
	
	var min []int32 = arr[0:len(arr)-1];
	var max []int32 = arr[1:];

	var sumMin, sumMax int64 = 0, 0;

	for i := 0; i < len(min); i++ {
		sumMin += int64(min[i]);
		sumMax += int64(max[i]);
	}

	fmt.Printf("%d %d\n", sumMin, sumMax);
}//miniMaxSum()