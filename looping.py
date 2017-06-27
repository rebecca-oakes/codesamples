s1 = "QA Consulting"
s2 = "Office for National Statistics"

vowels = ["A", "a", "E", "e", "I", "i", "O", "o", "U", "u"]

for char in s1:
    if char in vowels:
        print(char, end = "")
        
print("\n")        
        
for char in s2:
    if char not in vowels:
        print(char, end = "")