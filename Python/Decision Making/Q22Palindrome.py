'''Question 22: Write a java program to check whether a number is palindrome or not.
Asked In Just Practice assignment
Input:
Number = 121

Output
Palindrome Number

Explanation:
Reverse of 121 is 121.
Since original number equals reversed number, it is a Palindrome.'''

n = int(input("Enter Number : "))

temp = n

rev = ((n%10)*100) + (((n//10)%10)*10) + n%10

if temp == rev :
    print("palindrome Number")
    
else:
    print("Not palindrome Number")
