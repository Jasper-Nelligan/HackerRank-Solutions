#!/bin/python

import math
import os
import random
import re
import sys

def solve(meal_cost, tip_percent, tax_percent):
    totalCost = meal_cost
    totalCost += meal_cost * float(tip_percent)
    #print totalCost
    totalCost+=meal_cost * float(tax_percent)
    print int(round(totalCost, 0)),

def IntToPercent(num):
    num= float(num)/100
    return num

if __name__ == '__main__':
    meal_cost = float(raw_input())

    tip_percent = float(IntToPercent(raw_input()))

    tax_percent = float(IntToPercent(raw_input()))

    solve(meal_cost, tip_percent, tax_percent)
    
