'''Question 13: Write a Java program to calculate compound interest.
Asked In Basic program
Input:
Principal = 2000
Rate = 10
Time = 2

Output:
Compound Interest = 420

Explanation:
Compound Interest is calculated using the formula:
CI = P(1 + R/100)^T ? P
After calculation, the compound interest is 420.'''

p = int(input("Enter Principal : "))
r = int(input("Enter Rate : "))
t = int(input("Enter Time : "))
c = p*(1+r/100)**t-p

print("Output")
print("Compound Interest : ",int(c))