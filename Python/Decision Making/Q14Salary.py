'''Question 14: Write a Java program to input the basic salary of an employee and calculate its Gross Salary according to the following rules.

Basic Salary <= 10000:
HRA = 20 percent
DA = 80 percent

Basic Salary <= 20000:
HRA = 25 percent
DA = 90 percent

Basic Salary > 20000:
HRA = 30 percent
DA = 95 percent
Asked In Just Practice assignment
Input:
Basic Salary = 15000

Output:
Gross Salary = 32250

Explanation:
Since Basic Salary is 15000 and it is <= 20000:
HRA = 25 percent of 15000 = 3750
DA = 90 percent of 15000 = 13500
Gross Salary = Basic Salary + HRA + DA
Gross Salary = 15000 + 3750 + 13500 = 32250'''

basicSal = int(input("Enter Basic Salary : "))

if basicSal<=10000:
    hra = basicSal*20//100
    da = basicSal*80//100
    
elif basicSal<=20000:
    hra = basicSal*25//100
    da = basicSal*90//100
    
elif basicSal>20000:
    hra = basicSal*30//100
    da = basicSal*95//100
    
grossSal = basicSal + hra + da
print("Gross Salary : ",grossSal)