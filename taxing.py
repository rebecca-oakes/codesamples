# !/usr/bin/python
# -*- coding: latin-1 -*-
salary = input("Input Salary:")
grade = input("Input Salary Grade between 1 to 20:")
dept = input("Input either HR or IT for dept:")

sal = int(salary)
gr = int(grade)
tax = 0

if(sal > 15000):
    if(gr >= 1 and gr <= 10):
            tax = sal * (9/100)
    else: 
        if (gr > 10 and dept == "HR"):
            tax = sal * (17/100)
        else:
            tax = sal * (15/100)

taxed = sal - tax            
cto = sal * (2/100)
bonus = sal * (5/100)

if(dept == "HR"):
    print("Tax: £" + str(tax) + ", Taxed Salary: £" + str(taxed) + ", CTO: £" + str(cto))
else:
    print("Tax: £" + str(tax) + ", Taxed Salary: £" + str(taxed) + ", Bonus: £" + str(bonus))