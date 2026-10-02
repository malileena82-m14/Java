'''Question 23: Write a Java program to calculate the sum of the first and last digit without using a loop.
Asked In Basic program
Input:
123

Output:
4

Explanation:
First digit = 1
Last digit = 3
Sum = 1 + 3 = 4.'''

n = int(input("Enter number : "))

first = n//100
rem = n%100
last = rem%10

sum = first + last
print(sum)

