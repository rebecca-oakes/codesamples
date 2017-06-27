def add(x, y):
    print("%d + %d = %d" %(x, y, (x + y)))
    
def maths(f, x, y):
    f(x, y)
    
maths(add, 5, 6)