'''Question 10: Write a Java program to calculate the area of an equilateral triangle.
Asked In Basic program
Input : Side = 6
Output : Area = 15.59
Explanation : Area is calculated using the formula for equilateral triangles.'''


import math
side = int(input("Enter Side : "))
a = (math.sqrt(3)/4)*side*side
print("Area : ",round(a,2))