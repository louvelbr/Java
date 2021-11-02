package tp6;
/**
 * ViewingStand.java
 *
 * Student Name: Louve Le Bronec
 * Student Number: 3079406
 */
import java.util.concurrent.locks.*;
public class ViewingStand {
	boolean seats[] = new boolean[10];
	private int available = 10;
	private Lock lock = new ReentrantLock();
	private Condition seat = lock.newCondition();
	
	public ViewingStand(){
		for(int j = 0; j < 10;j++) seats[j] = true; // all available
	}
	
	public int findSeat () {
		lock.lock();
		try{
		while(available == 0){
		 try{
		 seat.await();
		 }catch(InterruptedException e){}
		}
		//search for free seats
		int k = 0;
		while(!seats[k]) k++;
		seats[k] = false;
		available--;
		return k;
		} finally{ lock.unlock();}
		
	}
	
	public void leaveSeat (int k) {
		lock.lock();
		try{
			seats[k] = true;
			 available++;
			seat.signal();
			} finally{lock.unlock();}
	}
}


