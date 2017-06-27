def Setup(n):
    nm = Numbers(n)
    return nm
    
def Numbers(n):
    string = input("Enter Number " + str(n) + " please:")
    num = -1
    if(string.isdigit() == True):
        num = int(string)
    else:
        print("You entered a String instead of a number, returning -1")
    return num

def Again():
    inp = input("Would you like to repeat the process?: Yes/No")
    inp.lower()
    if (inp == "yes" or inp == "y"):
        return True
    else:
        return False

def Addition(x, n):
    print ("The Result is " + str(x + n))
    
def Subtraction(x, n):
    print ("The Result is " + str(x - n))
    
def Multiplication(x, n):
    print ("The Result is " + str(x * n))
    
def Division(x, n):
    print ("The Result is " + str(x / n))
    
def TimesTables(n, r):
    print ("Times Table for" + str(n) + " from 1 to " + str(r))
    for x in range(1, r + 1):
        print (str(n) + " x " + str(x) + " = " + str(n * x))

cont = True
num = 0

while (cont == True):
    print ("1. Addition")
    print ("2. Subtraction")
    print ("3. Multiplication")
    print ("4. Division")
    print ("5. Times Tables")
    print ("6. Quit")

    numb = input("Which function do you want to use?")
    if(numb.isdigit() == True):
        num = int(numb)
    else:
        print("Please enter a number this time")
    
    if(num >= 1 and num <= 5):
        request = True
        
        while (request == True):  
            if (num >= 1 and num < 5):
                n1 = Setup(1)
                n2 = Setup(2)          
            if (num == 1):
                Addition(n1, n2)
                request = Again()
            if (num == 2):
                Subtraction(n1, n2)
                request = Again()
            if (num == 3):
                Multiplication(n1, n2)
                request = Again()
            if (num == 4):
                Division(n1, n2)
                request = Again()
            if (num == 5):
                ns = input("What times table do you want to see?:")
                rs = input ("What range do you want to see?:")
                if(ns.isdigit() == True and rs.isdigit() == True):
                    n = int(ns)
                    r = int(rs)
                TimesTables(n, r)
                request = Again()
                
    if(num == 6):
        cont = False