'''Question 19: Given a score out of 100, print Excellent (?90), Good (?75), Average (?50), Poor (< 50) — using 
nested ternary operators.
Asked In Just Practice assignment
Input:
Score = 82

Output:
Good

Explanation:
82 is greater than 75 but less than 90, so the grade is "Good".
Nested ternary operators are used instead of multiple if-else statements.'''

score = int(input("Enter Score : "))

result = "Excellent" if score >= 90 else "Good" if score >= 75 else "Average" if score >= 50 else "Poor"

print(result)