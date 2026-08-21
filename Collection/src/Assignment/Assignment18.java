/*Q18.Create Movie class:
movieId
movieName
rating
Store movies in Vector and display movies having rating above 4.
Description
Condition:
rating > 4
Input
1 Pushpa 4.5
2 Leo 3.8
3 KGF 4.7
4 Jawan 4.2
Output
Top Rated Movies:
Pushpa
KGF
Jawan*/

package Assignment;
import java.util.*;
class Movie
{
	private int movieId;
	private String movieName;
	private float rating;
	
	Movie(int movieId,String movieName,float rating)
	{
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

}
public class Assignment18 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector<Movie> v = new Vector<Movie>();
		System.out.println("Enter input");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Movie Id");
			int movieId = xyz.nextInt();
			
			System.out.println("Enter Movie Name");
			String movieName = xyz.next();
			
			System.out.println("Enter Movie rating");
			float rating = xyz.nextFloat();
			
			Movie m = new Movie(movieId,movieName,rating);
			v.add(m);
		}
		System.out.println("Top Rated Movies:");
		for(Movie m:v)
		{
			if(m.getRating()>4)
			{
				System.out.println(m.getMovieName());
			}
		}
	}

}
