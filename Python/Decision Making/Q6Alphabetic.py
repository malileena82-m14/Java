'''Question 6: Write a Java program to check whether a character is alphabetic or not.
Asked In Just Practice assignment
Input:
Character = A

Output:
Alphabet

Explanation:
If character lies between A–Z or a–z.'''

ch = (input("Enter Character : "))

if (ch>='A' and ch<='Z') or (ch>='a' and ch<='z'):
    print("Alphabet")
else :
    print("not Alphabet")