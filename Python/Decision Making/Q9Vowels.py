'''Question 9: Write a java program to input any alphabet and check whether it is vowel or consonant.
Asked In Just Practice assignment
Input:
Character = e

Output:
Vowel

Explanation:
Vowels: a, e, i, o, u.'''

ch = (input("Enter Character : "))

if (ch=='a' or ch=='e' or ch=='i' or ch=='o' or ch=='u') or (ch=='A' or ch=='E' or ch=='I' or ch=='O' or ch=='U'):
    print("Vowel")
 
else:
    print("not Vowel")
