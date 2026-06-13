"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-13
Last modified: 2026-06-13
Description: Time Conversion - HackerRank
Test description: https://www.hackerrank.com/challenges/time-conversion/problem
"""
#---------- functions ----------
def timeConversion(s: str) -> str:
    """
    Converts a time in 12-hour AM/PM format to military (24-hour) time.

    Args:
        s (str): A string representing the time in 12-hour format (e.g., "07:05:45PM").

    Returns:
        str: A string representing the time in 24-hour format (e.g., "19:05:45").
    """
    hour = int(s[0:2])
    minute = s[3:5]
    second = s[6:8]
    period = s[8:]

    if period == "AM":
        if hour == 12:
            hour = 0
    else:
        if hour != 12:
            hour += 12

    return f"{hour:02}:{minute}:{second}"