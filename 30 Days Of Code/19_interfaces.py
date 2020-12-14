

class Calculator(AdvancedArithmetic):
    def divisorSum(self, n):
        total = n
        i = 1
        if n%2 == 1:
            odd = True
        else:
            odd = False
                
        while i<n:
            if n%i == 0:
              total += i
            if odd:
                i += 2
            else:
                i += 1
        return total
        

                

