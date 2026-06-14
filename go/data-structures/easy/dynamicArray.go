/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-14
Last modified: 2026-06-14
Description: Dynamic Array - HackerRank
See: https://www.hackerrank.com/challenges/dynamic-array/problem
*/
//--------- package ---------
package easy


//--------- functions ---------
// dynamicArray - Processes a list of queries on a dynamic array and returns the results.
func dynamicArray(n int32, queries [][]int32) []int32 {
	var lastAnswer int32 = 0;
	var ans []int32 = []int32{};

	var arr [][]int32 = make([][]int32, n);

	for i := 0; i < len(queries); i++ {
		if queries[i][0] == 1 {
			arr[(queries[i][1] ^ lastAnswer) % n] = append(arr[(queries[i][1] ^ lastAnswer) % n], queries[i][2]);
		} else {
			lastAnswer = arr[(queries[i][1] ^ lastAnswer) % n][queries[i][2]%int32(len(arr[(queries[i][1] ^ lastAnswer) % n]))]
			ans = append(ans, lastAnswer);
		}
	}

	return ans;
}//end dynamicArray()