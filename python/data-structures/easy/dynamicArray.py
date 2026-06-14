"""
Author: Rithie Natan Carvalhaes Prado
Date: 2026-06-14
Last modified: 2026-06-14
Description: Dynamic Array - HackerRank
Test description: https://www.hackerrank.com/challenges/dynamic-array/problem
"""
#---------- functions ----------
def dynamicArray(n: int, queries: list[list[int]]) -> list[int]:
    """
    Process a list of queries on a dynamic array and return the results.

    Parameters:
        n (int): The number of sequences in the dynamic array.
        queries (list[list[int]]): A list of queries to process.

    Returns:
        list[int]: A list of the results of the queries.
    """
    lastAnswer: int = 0
    ans: list[int] = []
    arr: list[list[int]] = [[] for _ in range(n)]

    for q in queries:
        if q[0] == 1:
            idx: int = (q[1] ^ lastAnswer) % n
            arr[idx].append(q[2])
        else:
            idx: int = (q[1] ^ lastAnswer) % n
            lastAnswer = arr[idx][q[2] % len(arr[idx])]
            ans.append(lastAnswer)

    return ans