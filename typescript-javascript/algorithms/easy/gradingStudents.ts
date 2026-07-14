/**
 * @author Rithie Natan Carvalhaes Prado
 * @date 2026-07-13
 * Last modified: 2026-07-13
 * @description Grading Students - HackerRank
 * @see {@link https://www.hackerrank.com/challenges/grading/problem}
 */
//---------- functions ----------
/**
 * Rounds the grades of student.
 * 
 * @param {number[]} grades
 * @returns {number[]}
 */
function gradingStudents(grades: number[]): number[] 
{
    const roundedGrades: number[] = [];
    
    for(const grade of grades)
    {
        if(grade >= 38)
        {  
            const round: number = grade % 5;
            roundedGrades.push(round >= 3 ? (grade + (5 - round)) : grade);
        }
        else
        { roundedGrades.push(grade); }
    }
    
    return(roundedGrades);
}//end gradingStudents()