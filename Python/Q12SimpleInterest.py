'''Question 12: Write a Java program to calculate simple interest.
Asked In Basic program
Input:
Principal = 1000
Rate = 5
Time = 2

Output:
Simple Interest = 100

Explanation:
Simple Interest formula:
SI = (Principal * Rate * Time) / 100
Applying the formula gives 100.'''

p = int(input("Enter Principal : "))
r = int(input("Enter Rate : "))
t = int(input("Enter Time : "))

s = (p*r*t)/100

print("Output")
print("Simple Interest : ",int(s))
