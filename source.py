from os import path

source = input("Please enter source file name:")
dest = input("Please enter name of file to be created:")
search = input("What character is being searched for?:")
replace = input("What is it to be replaced by?:")

if ".txt" not in source:
    source = source + ".txt"
    
if ".txt" not in dest:
    dest = dest + ".txt"
    
print("File Exists: %s"  %str(path.exists(source)))

print("Size of the file:%s" %str(path.getsize(source)))

print("is it a file:%s" %str(path.isfile(source)))

print("Is it a folder:%s" %str(path.isdir(source)))

print("The actual path of the file:%s" %str(path.realpath(source)))

print("The split path of the file:%s" %str(path.split(path.realpath(source))))

head,tail=path.split(path.realpath(source))

print ("Head: %s" %head)

print ("Tail: %s" %tail)
    
f = open(source, "r")
n = open(dest, "w")

data = f.read()

for char in search:
    if char in data:
        data = data.replace(char, replace)

n.write(data)
n.close()
f.close()
