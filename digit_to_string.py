numbers = {1 : "one", 2 : "two", 3 : "three", 4 : "four", 5 : "five", 6 : "six", 7 : "seven", 8 : "eight", 9 : "nine", 10 : "ten", 11 : "eleven", 
           12 : "twelve", 13 : "thirteen", 15 : "fifteen", 20 : "twenty", 30 : "thirty", 40 : "forty", 50 : "fifty", 60 : "sixty", 70 : "seventy",
           80 : "eighty", 90 : "ninety"}

def checkNum(d):    # Check the number of digits the inputed number 
    num = 0
    
    if d <= 0:  # Depending on what the number is, return the number of digits
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
    
def twoDigits(d):   # if the number input into the program is a 2 digit number
    if(d == 10 or d == 11 or d == 12 or d == 13 or d == 15 or d == 20 or d == 30 or d == 40 or d == 50 or d == 60 or d == 70 or d == 80 or d == 90):
        print(numbers[d])  # if one of the numbers in this super-long if statement, just print it
    else: # split the digits
        f = int(d / 10) * 10
        s = d % 10
        if(d == 14 or d == 16 or  d == 17 or d == 18 or d == 19): # if one of these, get the number and add teen to it
            print("%steen" %(numbers[s]))  
        else: # get the two numbers and print
            print("%s %s" %(numbers[f], numbers[s]))
            
def threeDigits(d): # if number input into program is a 3 digit number
    f = int(d / 100)
    r = d % 100
    
    if(r == 0):     # if remainder is 0, just print out the hundred value
        print("%s hundred" %(numbers[f]))
    else:    
        if(r < 13 or r == 15 or r == 20 or r == 30 or r == 40 or r == 50 or r == 60 or r == 70 or r == 80 or r == 90):
            print("%s hundred and %s" %(numbers[f], numbers[r]))    # if remainder is one of the numbers above, just print it and hundred value
        else:
            s = int(r / 10) * 10
            t = r % 10
            if(r == 14 or r == 16 or  r == 17 or r == 18 or r == 19):   # Make it a teen again if one of these numbers
                print("%s hundred and %steen" %(numbers[f], numbers[s]))  
            else:       # Get the numbers and print
                print("%s hundred and %s %s" %(numbers[f], numbers[s], numbers[t]))
                
def fourDigits(d):  # if number input into program is a 4 digit number
    f = int(d / 1000)
    r = d % 1000
    
    if(r == 0):     # if remainder here is 0, just print the thousand value
        print("%s thousand" %(numbers[f]))
    else:
        s = int(r / 100)
        rs = r % 100
        if(rs == 0):    # if remainder here is 0, just print the thousand and hundred value
            print("%s thousand %s hundred" %(numbers[f], numbers[s]))
        else:    
            if(rs < 13 or rs == 15 or rs == 20 or rs == 30 or rs == 40 or rs == 50 or rs == 60 or rs == 70 or rs == 80 or rs == 90):
                print("%s thousand %s hundred and %s" %(numbers[f], numbers[s], numbers[rs]))   # add these to the previous value if that is 
            else:                                                                               # what remainder is
                t = int(rs / 10) * 10
                n = rs % 10
                if(rs == 14 or rs == 16 or  rs == 17 or rs == 18 or rs == 19):  # if one of these numbers, add to previous vale
                    print("%s thousand %s hundred and %steen" %(numbers[f], numbers[s], numbers[t]))  
                else:       # else find and print here
                    print("%s thousand %s hundred and %s %s" %(numbers[f], numbers[s], numbers[t], numbers[n]))

def Again():        # would you like to repeat the process?
    inp = input("Would you like to repeat the process?: Yes/No")
    inp.lower()
    if (inp == "yes" or inp == "y"):
        return True
    else:
        return False

digits = 0
num = 0
request = True

while request == True:
    print("Please enter a number between 1 and 9999:")  # Take in number
    digits = int(input())
    num = checkNum(digits)
    
    # if num is this, do this
    if(num == 1):
        print(numbers[digits])
    elif(num == 2):
        twoDigits(digits)
    elif(num == 3):
        threeDigits(digits)
    elif(num == 4):
        fourDigits(digits)
            
    request = Again()