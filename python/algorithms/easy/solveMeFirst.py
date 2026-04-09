"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-04-09
Last modified: 2026-04-09
Description: Solve Me First - HackerRank
Test description: https://www.hackerrank.com/challenges/solve-me-first/problem
"""
#---------- functions ----------
def solveMeFirst(a: int, b: int) -> int:
    """
    It takes two integers as input and returns their sum.

    Parameters:
    a (int): The first integer.
    b (int): The second integer.

    Returns:
    int: The sum of the two integers.

    Raises:
    ValueError: If either a or b is negative, or if either a or b is greater than 1000.
    """
    if a <= 0 or b <= 0 or a > 1000 or b > 1000:
        raise ValueError("Input integers must be within the range of 1 to 1000.")

    return a + b


#---------- Main ----------
if __name__ == "__main__":
    """
    The main function to test other kind of inputs.
    """
    num1 = int(input())
    num2 = int(input())
    res = solveMeFirst(num1, num2)
    print(res)