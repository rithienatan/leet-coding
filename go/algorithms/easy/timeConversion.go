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
func timeConversion(s string) string {
	hour := s[0:2]
	minute := s[3:5]
	second := s[6:8]
	period := s[8:]
	
	if period == "AM" {
		if hour == "12" {
			hour = "00"
		}
	} else {
		if hour != "12" {
			hourInt := 0
			fmt.Sscanf(hour, "%d", &hourInt)
			hourInt += 12
			hour = fmt.Sprintf("%02d", hourInt)
		}
	}

	return fmt.Sprintf("%s:%s:%s", hour, minute, second)
}//end timeConversion()