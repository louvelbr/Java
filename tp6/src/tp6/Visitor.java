package tp6;
/**
 * Visitors.java
 *
 * Student Name: Louve Le Bronec
 * Student Number: 3079406
 */

class Visitor extends Thread{
ViewingStand viewingStand; int num; int t;
public Visitor(ViewingStand vs, int j){
	viewingStand = vs;num = j;
}
public void run(){
// find a seat
int k = viewingStand.findSeat();
	
try{
	t = (int)(Math.random()*10000);
	Thread.sleep(t);
}catch(InterruptedException e){}
	

System.out.println("Visitor: " + num + " used seat: " + k + " for: " + t/1000.0 + " secondes");

// leave a seat
viewingStand.leaveSeat(k);
	System.out.println("Visitor: " + num + " freed seat: " + k);	
}
}
