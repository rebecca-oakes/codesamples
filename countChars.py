alpha = {}

string = input("Please enter a string:")

for char in string:
    if ord(char) >= 97 and ord(char) <= 122:
        char = chr(ord(char) - 32)

    if char.isalpha():
        if char in alpha:
            alpha[char] += 1
        else:
            alpha[char] = 1
        
for a in alpha:
    if alpha[char] != 0:
        print("%s : %d" %(a, alpha[a]))