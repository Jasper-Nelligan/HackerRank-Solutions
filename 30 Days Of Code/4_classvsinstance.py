class Person:

    def __init__(self,initialAge):
        if initialAge < 0:
            print "Age is not valid, setting age to 0."
            self.age = 0
            #print "Age is negative and so was set to: " + str(self.age)
        else: 
            self.age = initialAge
        #print "Age was set to: " + str(self.age)
        #print "Just age is: " + str(age)
    
    def amIOld(self):
        if self.age < 13:
            print "You are young."
        elif self.age >= 13 and self.age < 18:
            print "You are a teenager."
        else:
            print "You are old."
    
    def yearPasses(self):
        self.age += 1
        #print "age is now " + str(self.age)

