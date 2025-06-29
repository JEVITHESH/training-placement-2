import math
import os
import random
import re
import sys

if __name__ == '__main__':
    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])
    m = int(first_multiple_input[1])

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    k = int(input().strip())

    # Sort the array based on the k-th column
    arr.sort(key=lambda x: x[k])

    # Print the sorted array
    for row in arr:
        print(*row)
