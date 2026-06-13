"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Compare the Triplets - HackerRank
Test description: https://www.hackerrank.com/challenges/compare-the-triplets/problem
"""
#---------- functions ----------
def diagonalDifference(arr: list[list[int]]) -> int:
    """
    Calculate the absolute difference between the sums of the diagonals of a square matrix.

    Parameters:
        arr (list[list[int]]): A square matrix represented as a list of lists.

    Returns:
        int: The absolute difference between the sums of the diagonals.
    """
    
    leftToRight = sum(arr[i][i] for i in range(len(arr)))
    rightToLeft = sum(arr[i][len(arr) - 1 - i] for i in range(len(arr)))

    return abs(leftToRight - rightToLeft)