'''Question 1: Write a Java program to check whether a number is even or odd.
Asked In Just Practice assignment
Input:
Number = 8

Output:
Even

Explanation:
If a number is divisible by 2, it is Even. Otherwise, it is Odd.'''

n = int(input("Enter a Number : "))

if n%2==0:
    print("Even")
else :
    print("Odd")