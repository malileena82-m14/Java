'''Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.
Asked In Just Practice assignment
Input:
A = 5, B = 5, C = 5

Output:
Equilateral

Explanation:
All sides equal ? Equilateral
Two sides equal ? Isosceles
All sides different ? Scalene'''

a = int(input("Enter side1 : "))
b = int(input("Enter side2 : "))
c = int(input("Enter side3 : "))

if a==b and b==c and c==a:
    print("Equilateral Triangle")

elif a==b or b==c or c==a:
    print("Isosceles Triangle")
    
else :
    print("Scalene")