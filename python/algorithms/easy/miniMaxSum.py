"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Mini-Max Sum - HackerRank
Test description: https://www.hackerrank.com/challenges/mini-max-sum/problem
"""
#---------- functions ----------
def miniMaxSum(arr: list[int]) -> None:
    """
    Calculate the minimum and maximum sum of an array.

    Parameters:
        arr (list[int]): An array of integers.
    """

    arr.sort()

    min_sum = sum(arr[:-1])
    max_sum = sum(arr[1:])

    print(min_sum, max_sum)