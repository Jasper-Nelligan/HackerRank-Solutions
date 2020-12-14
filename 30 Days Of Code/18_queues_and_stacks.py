

class Solution:
    def __init__(self):
        self.stack = []
        self.queue = []
        
    def pushCharacter(self, ch):
        self.stack.append(ch)
        
    def popCharacter(self):
        return(self.stack.pop(-1))

    def enqueueCharacter(self, ch):
        self.queue.append(ch)
        
    def dequeueCharacter(self):
        return(self.queue.pop(0))
        
