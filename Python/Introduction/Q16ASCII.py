'''Question 16: Write a Java program to print the ASCII value of a given character
Asked In Basic program
Input:
Character = A

Output:
ASCII value = 65

Explanation:
Every character has a unique ASCII value. When a character is typecast to an integer, its ASCII value is obtained. 
The ASCII value of 'A' is 6'''

c = input("Enter Character : ")
n = ord(c)
print("ASCII value : ",int(n))