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
import "fmt"


//--------- functions ---------
// plusMinus Calculates and prints the ratios of positive, negative, and zero elements in an array.
func plusMinus(arr []int32) {
	var plusCount, minusCount, zeroCount int32 = 0, 0, 0;
	
	for _, value := range arr {
		if value > 0 {
			plusCount++;
		} else if value < 0 {
			minusCount++;
		} else {
			zeroCount++;
		}
	}//end for
	
	fmt.Printf("%.6f\n", float64(plusCount)/float64(len(arr)))
	fmt.Printf("%.6f\n", float64(minusCount)/float64(len(arr)))
	fmt.Printf("%.6f\n", float64(zeroCount)/float64(len(arr)))
}//end plusMinus()