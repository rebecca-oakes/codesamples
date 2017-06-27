class ONE:
    def __init__(self, x, y, z):
        self.X = x 
        self.Y = y 
        self.Z = z 
        
    def __add__(self, other):
        SO = ONE(0, 0, 0)
        SO.X = self.X + other.X
        SO.Y = self.Y + other.Y
        SO.Z = self.Z + other.Z
        
        return SO 
    
    def __sub__(self, other):
        SO = ONE(0, 0, 0)
        SO.X = self.X - other.X
        SO.Y = self.Y - other.Y
        SO.Z = self.Z - other.Z
        
        return SO 
    
    def __mul__(self, other):
        SO = ONE(0, 0, 0)
        SO.X = self.X * other.X
        SO.Y = self.Y * other.Y
        SO.Z = self.Z * other.Z
        
        return SO 
    
    def __truediv__(self, other):
        SO = ONE(0, 0, 0)
        SO.X = self.X / other.X
        SO.Y = self.Y / other.Y
        SO.Z = self.Z / other.Z
        
        return SO 
        
    def __str__(self):
        return str(self.X) + " - " + str(self.Y) + " - " + str(self.Z)
    
one = ONE(10, 10, 10)
two = ONE(1, 2, 3)

first = one + two 
print(first)
second = one - two 
print(second)
third = one * two 
print(third)
fourth = one / two 
print(fourth)