def checkNum(d):
    num = 0
    
    if d <= 0:
        print("Invalid Low Number")
    elif d >= 1 and d < 10:
        num = 1
    elif d >= 10 and d < 100:
        num = 2
    elif d >= 100 and d < 1000:
        num = 3
    elif d >= 1000 and d < 10000:
        num = 4
    else:
        print("Invalid High Number")
        
    return num

def oneDigit(d):
    word = ""
    
    if(d == 1):
        word = "one"
    elif(d == 2):
        word = "two"
    elif(d == 3):
        word = "three"
    elif(d == 4):
        word = "four"
    elif(d == 5):
        word = "five"
    elif(d == 6):
        word = "six"
    elif(d == 7):
        word = "seven"
    elif(d == 8):
        word = "eight"
    elif(d == 9):
        word = "nine"
        
    return word

def twoDigits(d):
    if(d >= 10 and d < 20):
        if(d == 10):
            return "ten"
        elif(d == 11):
            return "eleven"
        elif(d == 12):
            return "twelve"
        elif(d == 13):
            return "thirteen"
        elif(d == 15):
            return "fifteen"
        else:
            teen = d % 10
            return oneDigit(teen) + "teen"
    else:
        first = d / 10
        second = d % 10
        word = ""
        
        if(first == 2):
            word = "twenty"
        elif(first == 3):
            word = "thirty"
        elif(first == 4):
            word = "forty"
        elif(first == 5):
            word = "fifty"
        elif(first == 6):
            word = "sixty"
        elif(first == 7):
            word = "seventy"
        elif(first == 8):
            word = "eighty"
        elif(first == 9):
            word = "ninety"
        
        if second != 0:
            word += oneDigit(second)
        return word

def threeDigits(d):
    first = d / 100
    rem = d % 100
    word = ""
    
    word = oneDigit(first) + " hundred "
    
    if(rem >= 10):
        word = word + twoDigits(rem)
    else:
        if(rem != 0):
            word = word + "and " + oneDigit(rem)
            
    return word

def fourDigits(d):
    first = d / 1000
    rem = d % 1000
    word = ""
    
    word  = oneDigit(first) + " thousand"
    if rem >= 100:
            word = word + " " + threeDigits(rem);
    elif rem >= 10:
            word = word + " " + twoDigits(rem);
    else:
        if rem != 0:
            word = word + " and " + oneDigit(rem); 
        
    return word;


def digitsF(n, d):
    word = ""
    
        
    return word

number = False
digits = 0
num = 0

while number == False:
    print("Please enter a number between 1 and 9999:")
    digits = int(input())
    num = checkNum(digits)
    if(num != 0):
        number = True

if(num == 1):
    word = oneDigit(digits)
elif(num == 2):
    word = twoDigits(digits)
elif(num == 3):
    word = threeDigits(digits)
else:
    word = fourDigits(digits)

print(word)