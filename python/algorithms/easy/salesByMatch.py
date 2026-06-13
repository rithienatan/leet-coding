"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Sales by Match - HackerRank
Test description: https://www.hackerrank.com/challenges/sales-by-match/problem
"""
#---------- functions ----------
def sockMerchant(n: int, ar: list[int]) -> int:
    """
    Counts the number of pairs of socks with matching colors.

    Parameters:
        n (int): The number of socks in the pile.
        ar (list[int]): An array of integers representing the color of each sock.

    Returns:
        int: The total number of matching pairs of socks.
    """
    countPairs = 0
    i = 0

    ar.sort()

    while i < n - 1:
        if ar[i] == ar[i + 1]:
            countPairs += 1
            i += 2
        else:
            i += 1

    return countPairs