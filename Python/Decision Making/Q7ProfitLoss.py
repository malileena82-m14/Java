'''Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
Asked In Just Practice assignment
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If SP > CP ? Profit
If SP < CP ? Loss'''

cp = int(input("Enter Cost Price : "))
sp = int(input("Enter Selling Price : "))

if sp>cp:
    print("Profit")
    
else :
    print("Loss")