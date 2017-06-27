a = input("Input Number:")
n = int(a)

if n > 100:
    print("A")
    if n > 500:
        print("1")
    else:
        print("2")
else:
    print("B")
    if n < 50:
        print("4")
    else:
        print("3")