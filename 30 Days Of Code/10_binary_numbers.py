#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    binary = bin(int(input()))[2:]
    max_1s = 0
    count_1s = 0
    for num in binary:
        if num == '1':
            count_1s += 1
        else:
            if count_1s > max_1s:
                max_1s = count_1s
            count_1s = 0
    print(max_1s)
                
