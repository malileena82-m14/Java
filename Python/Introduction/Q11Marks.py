'''Question 11: Write a Java program to enter marks of five subjects and calculate total marks and percentage.
Asked In Basic program
Input:
Marks = 70, 75, 80, 65, 60

Output:
Total = 350
Percentage = 70%

Explanation:
Total marks are calculated by adding all five subject marks.
Percentage = Total / 5.'''

print("Enter marks of 5 subject ")
a = int(input("Enter mark1 : "))
b = int(input("Enter mark2 : "))
c = int(input("Enter mark3 : "))
d = int(input("Enter mark4 : "))
e = int(input("Enter mark5 : "))
t = a+b+c+d+e
p = t/5
print("Output")
print("Total = ",t)
print("Percentage = ",int(p),"%")