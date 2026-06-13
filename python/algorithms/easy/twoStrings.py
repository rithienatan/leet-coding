"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Two Strings - HackerRank
Test description: https://www.hackerrank.com/challenges/two-strings/problem
"""
#---------- functions ----------
def twoStrings(s1: str, s2: str) -> str:
    """
    Function to determine if two strings share a common substring.

    Parameters:
        s1 (str): The first string.
        s2 (str): The second string.

    Returns:
        str: "YES" if the strings share a common substring, "NO" otherwise.
    """
    haveCommun = "NO"
    map = {}

    for i in s1:
        if i not in map:
            map[i] = 1
    
    for i in s2:
        if i in map:
            haveCommun = "YES"
            break

    return haveCommun