
        self.maximumDifference = None

    def computeDifference(self):
        min = self.__elements[0]
        max = self.__elements[0]
        for i in self.__elements:
            if i < min:
                min = i
            elif i > max:
                max = i
        self.maximumDifference = max - min
            
        
        
	# Add your code here


        
        
