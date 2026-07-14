"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-15
Last modified: 2026-06-15
Description: Birthday Cake Candles - HackerRank
Test description: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
"""
#---------- functions ----------
def birthdayCakeCandles(candles: list[int]) -> int:
    """
    Count how many candles are tallest in the array of candles. The tallest candles are the ones that can be blown out.

    Parameters:
        candles (list[int]): List of candle heights.

    Returns:
        int: Count of the tallest candles.
    """
    count = 1
    candles.sort(reverse=True)
    lastNumber = candles[0]

    for i in range(1, len(candles)):
        if candles[i] == lastNumber:
            count += 1
        else:
            break

    return count