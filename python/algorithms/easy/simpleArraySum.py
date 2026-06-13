"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-04-24
Last modified: 2026-06-13
Description: Simple Array Sum - HackerRank
Test description: https://www.hackerrank.com/challenges/solve-me-first/problem
"""
#---------- Imports ----------
import functools


#---------- functions ----------
def simpleArraySum(ar: list[int]) -> int:
    """
    Receive an array and sum all itens inside of it.

    Parameters:
    ar (list[int]): Array of numbers. 

    Returns:
    int: The sum of all values in array.
    """
    return functools.reduce(lambda x, y: x + y, ar)