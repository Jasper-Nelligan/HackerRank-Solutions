#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    arr = []
    start_index = 0
    max_sum = 0
    
    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))
    for row in range(4):
        for col in range(4):
            sum = 0
            sum += arr[row][col]
            sum += arr[row][col+1]
            sum += arr[row][col+2]
            sum += arr[row+1][col+1]
            sum += arr[row+2][col]
            sum += arr[row+2][col+1]
            sum += arr[row+2][col+2]
            if row == 0 and col == 0:
                max_sum = sum
            elif sum > max_sum:
                max_sum = sum
    print(max_sum)
            
