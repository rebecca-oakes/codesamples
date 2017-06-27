def exceptionTest(x, y, z):
    assert(x > 0 and y > 0), "Got to be above 0"
    try:
        if z == "+" or z == "add" or z == "addition":  
            print ("%d + %d = %d" %(x, y, (x + y)))
        elif z == "-" or z == "subtract" or z == "subtraction":
            print ("%d - %d = %d" %(x, y, (x - y)))
        elif z == "*" or z == "multiply" or z == "multiplication":
            print ("%d * %d = %d" %(x, y, (x * y)))
        elif z == "/" or z == "divide" or z == "division":
            print ("%d / %d = %d" %(x, y, (x / y)))
        elif z == "%" or z == "modulo" or z == "remainder":
            print ("%d % %d = %d" %(x, y, (x % y)))
    except ZeroDivisionError:
        print ("You can't divide by 0, you know that right?")
    except ValueError:
        print ("You haven't put in the right values you know?")
    except ArithmeticError:
        print ("This here means your maths is wrong")
    
x = 7.2
y = 7
print("What maths calculation do you want:") 
z = input().lower()

exceptionTest(x, y, z)