'''Question 7: Write a Java program to convert temperature from Fahrenheit to Celsius.
Asked In Basic program
Input:
Fahrenheit = 98

Output:
Celsius = 36.67

Explanation:
The formula used is:
C = (F ? 32) * 5 / 9
Applying the formula gives the Celsius temperature.'''

f = int(input("Enter Fahrenheit : "))
c = (f-32)*5/9

print("Output")
print("Celsius : ",c)