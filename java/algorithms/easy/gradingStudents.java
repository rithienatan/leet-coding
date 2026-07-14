/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-07-13
 * Last modified: 2026-07-13
 * @description Grading Students - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/grading/problem}
 */
//---------- Imports ----------
import java.util.*;


//---------- solution ----------
class Result 
{
    /**
     * Rounds the grades of student.
     * 
     * @param {List<Integer>} grades
     * @return {List<Integer>} roundedGrades
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<Integer>(grades.size());
        
        for(int grade: grades)
        {
            if(grade >= 38)
            {  
                int round = grade % 5;
                roundedGrades.add(round >= 3 ? (grade + (5 - round)) : grade);
            }
            else
            { roundedGrades.add(grade); }
        }//end for
        
        return(roundedGrades);
    }//end gradingStudents()
}//end class