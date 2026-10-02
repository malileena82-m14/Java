'''Question 21: Write a java program to check whether a number is neon or not neon without using loop.
Asked In Just Practice assignment
Input:
Number = 9

Output
Neon Number

Explanation:
Square of 9 = 9 * 9 = 81
Sum of digits of 81 = 8 + 1 = 9
Since sum (9) equals the original number (9), it is a Neon Number.'''

n = int(input("Enter Number : "))
sum =0
original = n
sq = n*n
digit = sq%10
digit1 = sq//10
sum = digit+digit1

if(sum==n):
    print("Neon number")
    
else:
    print("Not neon Number")



