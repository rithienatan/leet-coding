"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Compare the Triplets - HackerRank
Test description: https://www.hackerrank.com/challenges/compare-the-triplets/problem
"""
#---------- functions ----------
def compareTriplets(a: list[int], b: list[int]) -> list[int]:
    """
    Compare two triplets and return the scores.

    Parameters:
    a (list[int]): First triplet.
    b (list[int]): Second triplet.

    Returns:
    list[int]: Scores of both triplets.
    """
    result: list[int] = [0, 0]

    for idx, el in enumerate(a):
        if el > b[idx]:
            result[0] += 1
        elif el < b[idx]:
            result[1] += 1

    return result