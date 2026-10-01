'''Question 9: Write a Java program to enter two angles of a triangle and find the third angle.
Asked In Basic program
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70

Explanation:
The sum of all angles in a triangle is 180 degrees.
Third Angle = 180 ? (Angle1 + Angle2).'''

angle1 = int(input("Enter Angle1 : "))
angle2 = int(input("Enter Angle2 : "))
t = 180 - (angle1 + angle2)

print("Output")
print("Third Angle : ",t)