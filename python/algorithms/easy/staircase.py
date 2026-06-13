"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Staircase - HackerRank
Test description: https://www.hackerrank.com/challenges/staircase/problem
"""
#---------- functions ----------
def staircase(n: int) -> None:
    """
    Given a positive integer, print a staircase of size n.

    Parameters:
        n (int): The size of the staircase.
    """
    for i in range(1, n + 1):
        print(" " * (n - i) + "#" * i)