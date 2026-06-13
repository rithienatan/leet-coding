/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Sales by Match - HackerRank
See: https://www.hackerrank.com/challenges/sock-merchant/problem
*/
//--------- package ---------
package easy


//--------- Imports ---------
import "slices"


//--------- functions ---------
// sockMerchant - Finds the number of pairs of socks with matching colors.
func sockMerchant(n int32, ar []int32) int32 {
	var countPair int32 = 0;

	slices.Sort(ar);

	for i := int32(0); i < n-1; i++ {
		if ar[i] == ar[i+1] {
			countPair++;
			i++;
		}//end if
	}//end for

	return countPair;
}//end sockMerchant()