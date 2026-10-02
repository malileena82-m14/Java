'''Question 5: Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference.
Asked In Basic program
Input:
Radius = 7

Output:
Diameter = 14
Area = 153.86
Circumference = 43.96

Explanation:
Diameter = 2 * radius
Area = ? * r^2
Circumference = 2 * ? * r
The formulas are applied using the given radius.'''

r = int (input("Enter Radius : "))
d = 2*r
a = 3.14*r*r
c = 2*3.14*r
print("Output")
print("Diameter : ",d)
print("Area : ",a)
print("Circumference : ",c)