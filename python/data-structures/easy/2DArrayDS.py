"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-07-13
Last modified: 2026-07-13
Description: 2D Array - HackerRank
Test description: https://www.hackerrank.com/challenges/2d-array/problem
"""
#---------- functions ----------
def hourglassSum(arr: list[list[int]]) -> int:
    """
    Calculates the maximum hourglass sum in a 2D array.

    Parameters:
        arr (list[list[int]]): A 2D array of integers representing the input data.

    Returns:
        int: The maximum hourglass sum found in the 2D array.
    """
    max_sum = -99
    R = 6
    C = 6

    for i in range(R - 2):
        for j in range(C - 2):
            sum = (arr[i][j] + arr[i][j+1] + arr[i][j+2]) + \
                  (arr[i+1][j+1]) + \
                  (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2])

            max_sum = max(max_sum, sum)

    return max_sum