package tp6;
/**
 * Main.java
 *
 * Student Name: Louve Le Bronec
 * Student Number: 3079406
 */
import java.util.concurrent.locks.ReentrantLock;
public class Lab6 {

	public static void main(String[] args) {
		ViewingStand vs = new ViewingStand();
		
		for(int j = 0; j < 20;j++) new Visitor(vs,j).start();
		
	}

}
