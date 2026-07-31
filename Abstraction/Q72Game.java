/*Question 72: Create abstract class Game.
Asked In Practice Question
Abstract method calculateScore().
Subclasses:

IndoorGame

OutdoorGame

Input
Points: 80
Output
Score: 80*/

import java.util.*;
abstract class Game
{
	int point;
	Game(int point)
	{
		this.point = point;
	}
	abstract void calculateScore();
}
class IndoorGame extends Game
{
	IndoorGame(int point)
	{
		super(point);
	}
	void calculateScore()
	{
		System.out.println("Score: "+point);
	}
}
class OutdoorGame extends Game
{
	OutdoorGame(int point)
	{
		super(point);
	}
	void calculateScore()
	{
		System.out.println("Score: "+point);
	}
}
class Q72Game
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.IndoorGame");
		System.out.println("2.OutdoorGame");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Game g;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Points");
				int point = xyz.nextInt();
				g = new IndoorGame(point);
				g.calculateScore();
				break;
				
			case 2:
				System.out.println("Enter Points");
				int point1 = xyz.nextInt();
				g = new OutdoorGame(point1);
				g.calculateScore();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}