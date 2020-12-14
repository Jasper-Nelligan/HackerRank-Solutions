from __future__ import print_function

def PrintEvenIndex(string):
    for k in range(0,len(string),2):
        print(string[k],end="")
    return

def PrintOddIndex(string):
    for k in range(1,len(string),2):
        print(string[k],end="")
    return

if __name__ == "__main__":
    string_list = []
    t = int(raw_input())
    for i in range (t):
        string_list.append(raw_input())
        PrintEvenIndex(string_list[i])
        print(" ",end="")
        PrintOddIndex(string_list[i])
        if(i<t-1):
            print("\n",end="")

