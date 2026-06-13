/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Compare the Triplets - HackerRank
See: https://www.hackerrank.com/challenges/compare-the-triplets/problem
*/
//--------- package ---------
package easy


//--------- functions ---------
// compareTriplets compares the elements of two arrays and returns an array with the scores of each array.
func compareTriplets(a []int32, b []int32) []int32 {
	var res []int32 = []int32{0, 0};

	for i, value := range a {
		if value > b[i] {
			res[0]++;
		} else if value < b[i] {
			res[1]++;
		}//end if
	}//end for

	return res;
}//end compareTriplets()