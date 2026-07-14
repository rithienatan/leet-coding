"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-07-13
Last modified: 2026-07-13
Description: Apple and Orange - HackerRank
Test description: https://www.hackerrank.com/challenges/apple-and-orange/problem
"""
#---------- functions ----------
def countApplesAndOranges(s: int, t: int, a: int, b: int, apples: list[int], oranges: list[int]) -> None:
    """
    Counts the number of apples and oranges that fall on Sam's house.

    Parameters:
        s (int): Start position of Sam's house.
        t (int): End position of Sam's house.
        a (int): Position of the apple tree.
        b (int): Position of the orange tree.
        apples (list[int]): List of distances that apples fall from the tree.
        oranges (list[int]): List of distances that oranges fall from the tree.
    """
    countApples = 0
    countOranges = 0

    for apple in apples:
        reach = a + apple
        if s <= reach <= t:
            countApples += 1

    for orange in oranges:
        reach = b + orange
        if s <= reach <= t:
            countOranges += 1

    print(countApples)
    print(countOranges)