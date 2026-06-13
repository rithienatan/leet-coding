"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Counting Valleys - HackerRank
Test description: https://www.hackerrank.com/challenges/counting-valleys/problem
"""
#---------- functions ----------
def countingValleys(steps: int, path: str) -> int:
    """
    Counts the number of valleys in a given path.

    Parameters:
        steps (int): The number of steps in the path.
        path (str): A string representing the path, where 'U' is an uphill step and 'D' is a downhill step.

    Returns:
        int: The number of valleys in the path.
    """
    
    starts = path[0]
    last = ""
    seaLevel = -1 if path[0] == "D" else 1
    valleys = 0
    i = 1

    while i < steps:
        if path[i] == "D":
            seaLevel -= 1
        else:
            seaLevel += 1

        last = path[i]

        if seaLevel == 0 and starts == "D" and last == "U":
            valleys += 1
            i += 1
            last = ""

            if i <= steps-2:
                starts = path[i]
                seaLevel = -1 if path[i] == "D" else 1
        elif seaLevel == 0 and starts == "U" and last == "D":
            starts = path[i]
            last = ""
            i += 1
            
            if i < steps-2:
                seaLevel = -1 if path[i] == "D" else 1

        i += 1

    return valleys