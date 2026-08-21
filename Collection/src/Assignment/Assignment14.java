/*Q14.Create Player class:
playerId
playerName
runs
Store players in Vector and display players who scored even runs.
Description
Logical condition:
runs % 2 == 0
Input
1 Virat 75
2 Rohit 80
3 Gill 66
4 KL 59
Output
Players with even runs:

2 Rohit 80
3 Gill 66*/

package Assignment;
import java.util.*;
class Player
{
	private int playerId;
	private String playerName;
	private int run;
	
	Player(int playerId,String playerName,int run)
	{
		this.playerId = playerId;
		this.playerName = playerName;
		this.run = run;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void setRun(int run)
	{
		this.run = run;
	}
	public int getRun()
	{
		return run;
	}
}

public class Assignment14 {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Vector <Player> v = new Vector<>();
		System.out.println("Enter number of Players");
		int n = xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id");
			int id = xyz.nextInt();
			
			System.out.println("Enter Name");
			String name = xyz.next();
			
			System.out.println("Enter run");
			int run = xyz.nextInt();
			
			Player p = new Player(id,name,run);
			
			v.add(p);
		}
		System.out.println("Players with even runs: ");
		for(Player p :v)
		{
			if(p.getRun()%2==0)
			{
				System.out.println(p.getPlayerId()+" " +p.getPlayerName()+" "+p.getRun());
			}
		}
	}
}
