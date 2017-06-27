from os import path
MAX_KEY_SIZE = 26

def GetKey():   
    key = 0

    while True:
        print('Enter the key number (1-%s)' %(MAX_KEY_SIZE))
        key = int(input())
        if (key >= 1 and key <= MAX_KEY_SIZE):
            return key
        
def firstCryption(type, crypt, key): # First level of encryption/decryption
    translated = ""
    if type == "decrypt":
        key = - key
    
    for c in crypt: # Take a char from string, if alphabet, add to its ASCII value the number inputed into system
        if c.isalpha():
            n = ord(c)
            n += key
            
            if c.isupper(): # if value would come out as non-alpha, +/- 26 from its value
                if n > ord('Z'):
                    n -= 26
                elif n < ord('A'):
                    n += 26
            elif c.islower():
                if n > ord('z'):
                    n -= 26
                elif n < ord('a'):
                    n += 26
            translated += chr(n)
        else:
            translated += c
    return translated

# Second Level of Encryption/Decryption
def secondCryption(type, crypt):
    translated = crypt[::-1]
    
#     if type == "encrypt":   # doesn't work
#         for char in translated:
#             temp = translated[char + 1]
#             translated[char + 1] = translated[char]
#             translated[char] = temp
#     else:
#         for char in translated:
#             temp = translated[char - 1]
#             translated[char - 1] = translated[char]
#             translated[char] = temp
    
    return translated
    
# Third Level of Encryption/Decryption
def thirdCryption(type, crypt): # doesn't work
    translated = ""
    
    cryptL = list(crypt) # change into a string array?
    cryptA = list()
    cryptF = list()# change into a string array
    index = 0
    
    if type == "encrypt":
        for char in cryptL:
            cryptA.insert(index, ord(char))
            index = index + 1
        index = 0
        for char in cryptA:
            cryptF.insert(index, str(cryptA[index]))
            index = index + 1
    else:
        for char in cryptL:#  only taking the one number here not the full ascii char needed
            cryptA.insert(index, int(char))
            index = index + 1
        index = 0
        for char in cryptA:
            cryptF.insert(index, chr(char))
            index = index + 1
#             
    translated = ''.join(cryptF)
    return translated

source = input("Please enter name of file to be used:")
type = input("Do you wish to encrypt or decrypt the file?:")

type.lower()

if ".txt" not in source:
    source = source + ".txt"

if(path.exists(source) == True):
    file = open(source, "r")
    crypt = file.read()
    key = GetKey()
    if type == "encrypt":
        crypted = firstCryption(type, crypt, key)
        crypted = secondCryption(type, crypted)
        crypted = thirdCryption(type, crypted)
    else:
        crypted = thirdCryption(type, crypt)
        crypted = secondCryption(type, crypted)
        crypted = firstCryption(type, crypted, key)
        
    file.close()
    f = open(source, "w")
    f.write(crypted)
    f.close()