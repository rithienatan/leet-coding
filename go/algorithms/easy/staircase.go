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
	"strings"
)


//--------- functions ---------
func staircase(n int32) {
	for i := int32(1); i <= n-1; i++ {
		fmt.Printf("%s%s\n", strings.Repeat(" ", int(n-i)), strings.Repeat("#", int(i)))
	}//end for

	fmt.Println(strings.Repeat("#", int(n)))
}//end staircase()