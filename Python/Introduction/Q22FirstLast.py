'''Question 22: Write a Java program to find the first and last digit of a three-digit number without using a loop.
Asked In Basic program
Input:
456

Output:
First = 4
Last = 6

Explanation:
The first digit is obtained by dividing the number by 100.
The last digit is obtained using the modulus operator (% 10).'''

n = int(input("Enter Number : "))
f = n//100
rem = n%100
l = rem%10

print("Output")
print("First = ",f)
print("Second = ",l)