package Point;
/**
 * CollectionPoint.java
 *
 * Student Name: Louve Le Bronec
 * Student Number: 3079406
 */

//use synchronise
//create 2 threads

import java.util.*;
class CollectionPoint extends Thread{
	List<Point> list = new ArrayList<>();
	Point p;
	Point p2 = new Point(0,0);
	
	 public CollectionPoint(Point pi) {
	        p = pi;
	    }

	    public void run() {
	        synchronized(this) {
	            for(int i=0;i<1;i++) {
	            	//display the point
	            	System.out.println("Point: "+p);
	            	//add the point p in the list
	                add(p);
	                // search if point p2 is in the list
	                if (search(p2)) {
	                	System.out.println("The point "+p2+" has been found!");
	                }else {
	                	System.out.println("The point "+p2+" has not been found");	
	                }
	                //get all point with x = 1
	                System.out.println("This point has an x = 1: "+getAllX(1));
	                //replace point p by p2               
	                replace(p,p2);
	                System.out.println("The point: "+p+" has been replaced by: "+p2);
	                //change point to string
	                System.out.println("Now the point is a string: "+toString());
	            }
	        }
	    }

	synchronized void add(Point p){
		list.add(p);
	}
	
	synchronized boolean search(Point p){
		 Boolean isFound = false;
	        for (Point ab : list) {
	            if (ab.equals(p)) {
	                isFound = true;
	                break;
	            }
	        }

	        return isFound;
	}
	
	synchronized List<Point> getAllX(int x){
        List<Point> listx = new ArrayList<>();

        for (Point ab : list) {
            if (ab.x() == x) {
                listx.add(ab);
            }
        }

        return listx;
	}
	
	synchronized void replace(Point p1, Point p2){
		list.set(list.indexOf(p1), p2);
	}
	
	public synchronized String toString(){
		 String result = "";
	        for (Point ab : list) {
	            result += ab.toString();
	        }
	        return result;
	}
}

