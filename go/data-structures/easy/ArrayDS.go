/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-07-13
Last modified: 2026-07-13
Description: Array - DS - HackerRank
See: https://www.hackerrank.com/challenges/arrays-ds/problem
*/
//--------- package ---------
package easy


//--------- functions ---------
// reverseArray - Reverses the elements of an array.
func reverseArray(a []int32) []int32 {
	for i, j := 0, len(a)-1; i < j; i, j = i+1, j-1 {
		a[i], a[j] = a[j], a[i]
	}
	return a
}//end reverseArray()