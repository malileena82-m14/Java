'''Question 4: Write a Java program to check whether a number is positive, negative or zero.
Asked In Just Practice assignment
Input:
Number = -5

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero'''

n = int(input("Enter a Number : "))

if n>0:
    print("Positive")
elif n<0:
    print("Negative")
else :
    print("Zero")