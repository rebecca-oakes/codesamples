class Results:
    def __init__(self, x = 0, y = 0, z = 0):
        self.__phy = x
        self.__che = y 
        self.__mat = z 
        
    def setPhy(self, p):
        if p >= 0 and p <= 150:
            self.__phy = p 
        else:
            print("Invalid Physics Mark")   
          
    def setChe(self, c):  
        if c >= 0 and c <= 150:
            self.__che = c
        else:
            print("Invalid Chemistry Mark")
            
    def setMat(self, m):
        if m >= 0 and m <= 150:
            self.__mat = m 
        else:
            print("Invalid Maths Mark")
    
    def __calculations(self):
        self.total = self.__phy + self.__che + self.__mat
        self.percent = self.total * 100/450
        
    def showResults(self):
        self.__calculations()
        print("Total: %d" %(self.total))
        print("Percentage: %d" %(self.percent))
        
res = Results()
res.setPhy(75)
res.setChe(20)
res.setMat(120)
res.showResults()