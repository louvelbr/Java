package Point;
/**
 * Point.java
 *
 * Student Name: Louve Le Bronec
 * Student Number: 3079406
 */
 
import java.util.*;
public final class Point{
	private final int x, y;
	
	public Point(int x0, int y0){
		x = x0; y = y0;
	}
	
 	public int x(){
 		return x;
 	}
 	
	public int y(){
		return y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}

	public boolean equals(Object ob){
		if(!(ob instanceof Point)) return false;
		Point p = (Point)ob;
		return x == p.x && y == p.y;
	}
}

