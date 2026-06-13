/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Counting Valleys - HackerRank
See: https://www.hackerrank.com/challenges/counting-valleys/problem
*/
//--------- package ---------
package easy


//--------- functions ---------
// countingValleys - counts the number of valleys a hiker has walked through given the number of steps and the path taken.
func countingValleys(steps int32, path string) int32 {
	var starts, last = path[0], path[0];
	var seaLevel int32 = 0;
	var valleys int32 = 0;

	if path[0] == 'D' {
		seaLevel--;
	} else {
		seaLevel++;
	}

	for i := int32(1); i < steps; i++ {
		if path[i] == 'D' {
			seaLevel--;
		} else {
			seaLevel++;
		}//end if
		last = path[i];

		if seaLevel == 0 && starts == 'D' && last == 'U' {
			valleys++; i++; starts = ' ';

			if i <= steps-2 {
				starts = path[i]; 

				if path[i] == 'D' {
					seaLevel--;
				} else {
					seaLevel++;
				}//end if
			}
		} else if seaLevel == 0 && starts == 'U' && last == 'D' {
			starts = path[i]; last = ' '; i++;

			if i <= steps-2 {
				if path[i] == 'D' {
					seaLevel--;
				} else {
					seaLevel++;
				}//end if
			}
		}
	}//end for

	return(valleys);
}//end countingValleys()