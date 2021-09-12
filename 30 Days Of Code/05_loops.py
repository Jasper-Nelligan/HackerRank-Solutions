#!/bin/python

import math
import os
import random
import re
import sys

def MultiplesOfn(n):
    for x in range(1,11):
        Mproduct = n*x
        print str(n) + " x " + str(x) + " = " + str(Mproduct)





if __name__ == '__main__':
    n = int(raw_input())
    MultiplesOfn(n)
