Question 1: Write a Java program to create a thread using Thread class and display numbers from 1 to 10.

Create a class that extends Thread. Override the run() method and print numbers from 1 to the given limit. Start the thread 
from the main method.
Asked In Practice Assignment
Input:
Enter limit: 10

Output:
Thread started
1 2 3 4 5 6 7 8 9 10
Thread finished

Explanation:
Creating threads using Thread class involves extending Thread and overriding run() method. The run() method contains the code 
to execute in thread. Call start() method to begin thread execution, not run() directly. Calling start() initializes thread 
state and calls run() internally, ensuring proper thread execution.

class Q1DisplayNumbers
{
}