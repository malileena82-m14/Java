'''Question 18: Write a Java program to convert days into years, months, and weeks.
Asked In Basic program
Input:
Days = 400

Output:
Years = 1
Months = 1
Weeks = 1

Explanation:
1 year = 365 days.
After subtracting 365 days, the remaining days are divided into months (30 days each) and weeks (7 days each).'''

d = int(input("Enter Days : "))
y = d//365
d = d%365

m = d//30
d = d%30

w = d//7

print("Output")
print("Years : ",y)
print("Months : ",m)
print("Weeks : ",w)
