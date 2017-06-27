#!/usr/bin/python

class maths:
    def add(self, x, y):
        print("%d + %d = %d" %(x, y, (x + y)))
        
    def subtract(self, x, y):
        print("%d + %d = %d" %(x, y, (x - y)))
        
    def message(self):
        print("Everyone else are cat murderers!!!!!")
        
mat = maths()

mat.add(7, 7)
mat.subtract(7, 5)
mat.message()