'''Question 21: Write a Java program to reverse a number without using a loop.
Asked In Basic program
Input:
123

Output:
321

Explanation:
Digits are separated using arithmetic operations and rearranged in reverse order without using loops.'''

n = int(input("Enter Number : "))

rev = ((n%10)*100)+((n//10)%10)*10+(n//100)

print(rev) 

