dict = {1:"Blairgowrie", 2:"Stirling", 3:"Newport", 4:"Houston", 5:"Lumphanan"}

for d in dict:
    print("Key: " + str(d) + ", Value: " + dict[d])
    
dict[6] = "Manchester"

for d in dict:
    print("Key: " + str(d) + ", Value: " + dict[d])
    
dict.pop(4)

for d in dict:
    print("Key: " + str(d) + ", Value: " + dict[d])