'''Question 10: Write a java program to input any character and check whether it is alphabet, digit or special character.
Asked In Just Practice assignment
Input:
Character = 5

Output:
Digit

Explanation:
Check ASCII ranges.'''

ch = input("Enter Character : ")

if ch>="0" and ch<="9":
    print("Digit")
    
elif ch>='A' and ch<='Z' or ch>='a' and ch<='z':
    print("Alphabet")
    
else:
    print("Special Character")
    
    