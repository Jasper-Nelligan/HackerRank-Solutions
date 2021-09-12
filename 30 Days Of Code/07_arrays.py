#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())

    array = list(map(int, input().rstrip().split())) #"list" is redundant
    
    for x in range(len(array)-1,-1,-1):
        print(array[x],end=" ")
