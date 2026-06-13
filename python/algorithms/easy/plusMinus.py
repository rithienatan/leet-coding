"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Plus Minus - HackerRank
Test description: https://www.hackerrank.com/challenges/plus-minus/problem
"""
#---------- functions ----------
def plusMinus(arr: list[int]) -> None:
    """
    Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.

    Parameters:
        arr (list[int]): An array of integers.
    """
    plusList = [value for value in arr if value > 0]
    minusList = [value for value in arr if value < 0]
    zeroList = [value for value in arr if value == 0]

    print(f"{len(plusList) / len(arr):.6f}")
    print(f"{len(minusList) / len(arr):.6f}")
    print(f"{len(zeroList) / len(arr):.6f}")