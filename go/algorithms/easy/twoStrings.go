/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Two Strings - HackerRank
See: https://www.hackerrank.com/challenges/two-strings/problem
*/
//--------- package ---------
package easy


//--------- functions ---------
// Determines if two strings share a common substring.
func twoStrings(s1 string, s2 string) string {
	var haveCommun string = "NO";
	var hashString map[string]int = make(map[string]int);

	for _, value := range s1 {
		if hashString[string(value)] == 0 {
			hashString[string(value)] = 1;
		}//end if
	}//end for

	for _, value := range s2 {
		if hashString[string(value)] == 1 {
			haveCommun = "YES"; break;
		}//end if
	}//end for

	return haveCommun;
}//twoStrings()