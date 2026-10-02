'''Question 16: Write a java program to find a minimum between three numbers.
Asked In Just Practice assignment
Input:
Number1 = 9
Number2 = 4
Number3 = 7

Output
Minimum number = 4

Explanation:
Compare all three numbers using nested if-else statements to determine the smallest number.'''

num1 = int(input("Enter number1 : "))
num2 = int(input("Enter number2 : "))
num3 = int(input("Enter number3 : "))

if num1<num2 and num1<num3:
    print("Minimum Number1 : ",num1)
    
elif num2<num1 and num2<num3:
    print("Minumum Number2 : ",num2)
    
else:
    print("Minimum Number3 ",num3)