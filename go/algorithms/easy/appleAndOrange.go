/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-07-13
Last modified: 2026-07-13
Description: Apple and Orange - HackerRank
See: https://www.hackerrank.com/challenges/apple-and-orange/problem
*/
//--------- package ---------
package easy


//--------- imports ---------
import (
	"fmt"
)


//--------- functions ---------
// Counts the number of apples and oranges that fall on Sam's house.
func countApplesAndOranges(s, t, a, b int32, apples, oranges []int32) {
	countApples := int32(0);
	countOranges := int32(0);

	for _, apple := range apples {
		reach := a + apple;
		if s <= reach && reach <= t {
			countApples++;
		}
	}

	for _, orange := range oranges {
		reach := b + orange;
		if s <= reach && reach <= t {
			countOranges++;
		}
	}

	fmt.Println(countApples);
	fmt.Println(countOranges);
}//end countApplesAndOranges()