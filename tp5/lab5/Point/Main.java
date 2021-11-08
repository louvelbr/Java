package Point;
/**
 * Main.java
 *
 * Student Name: Louve Le Bronec
 * Student Number: 3079406
 */
public class Main {

	public static void main(String[] args) {
		int N = 10;

        int x = 0, y = 0;

        for(int i=0;i<N;i++) {
            x = (int)(Math.random()*N);
            y = (int)(Math.random()*N);
            Point p = new Point(x,y);
            Thread cp = new CollectionPoint(p);
            cp.start();

            try {
                cp.join();
            } catch(InterruptedException e) {}

        }
	}

}
