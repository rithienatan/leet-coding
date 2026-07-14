"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-07-13
Last modified: 2026-07-13
Description: Grading Students - HackerRank
Test description: https://www.hackerrank.com/challenges/grading/problem
"""
#---------- functions ----------
def gradingStudents(grades: list[int]) -> list[int]:
    """
    Rounds the grades of students.

    Parameters:
        grades (list[int]): List of student grades.

    Returns:
        list[int]: List of rounded grades.  
    """
    roundedGrades: list[int] = []

    for grade in grades:
        if grade >= 38:
            round = grade % 5
            roundedGrades.append(round >= 3 and (grade + (5 - round)) or grade)
        else:
            roundedGrades.append(grade)

    return roundedGrades