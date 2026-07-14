/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-15
Last modified: 2026-06-15
Description: Birthday Cake Candles - HackerRank
See: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
*/
//--------- package ---------
package easy


//--------- imports ---------
import (
	"cmp"
	"slices"
)


//--------- functions ---------
// Count the number of candles that are tallest.
func birthdayCakeCandles(candles []int32) int32 {
	var count int32 = 1;
	slices.SortFunc(candles, func(a, b int32) int {
		return cmp.Compare(b, a);
	});
	lastNumber := candles[0];

	for i := 1; i < len(candles); i++ {
        if lastNumber == candles[i] {
            count++;
        } else {
            break;
        }
    }//end for
    
    return count;
}//end birthdayCakeCandles()