'''Question 8: Write a Java program to convert temperature from Celsius to Fahrenheit.
Asked In Basic program
Input:
Celsius = 37

Output:
Fahrenheit = 98.6

Explanation:
The formula used is:
F = (C * 9 / 5) + 32
The Celsius value is converted into Fahrenheit using this formula.'''

celsius = int(input("Enter Celsius : "))
f = (celsius*9/5)+32

print("Output")
print("Fahrenheit = ",f)