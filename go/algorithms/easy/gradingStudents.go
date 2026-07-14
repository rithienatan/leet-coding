/*
Author: Rithie Natan Carvalhaes Prado
Date: 2026-07-13
Last modified: 2026-07-13
Description: Grading Students - HackerRank
See: https://www.hackerrank.com/challenges/grading/problem
*/
//--------- package ---------
package easy


//--------- functions ---------
// Rounds the grades of student.
func gradingStudents(grades []int32) []int32 {
	roundedGrades := make([]int32, 0, len(grades))

	for _, grade := range grades {
		if grade >= 38 {
			round := grade % 5
			if round >= 3 {
				roundedGrades = append(roundedGrades, grade+(5-round))
			} else {
				roundedGrades = append(roundedGrades, grade)
			}
		} else {
			roundedGrades = append(roundedGrades, grade)
		}
	}

	return roundedGrades
}//end gradingStudents()