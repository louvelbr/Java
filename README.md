# Java
Exercises of Parallel and Distributed Programming in Java.

# Lab2
Given below is a sequential program that calculates the frequency of even values in a large array. Your task is to write a parallel solution that distributes all of the workload over the number of processors on the machine executing your program. The work should be distributed so that each thread deals with block segments that do not differ in size by more than 1.

```
 public static void main(String[] args) {
          int f[] = new int[1000000];
          for(int j = 0; j < f.length;j++) f[j] = (int)(Math.random()*100000);
          int freq = 0;
          for(int j = 0; j < f.length; j++)
        	  if(f[j] % 2 == 0) freq++;
          System.out.println(freq);
      }
 ```

# Lab6
In the Prado museum in Madrid there is a small seating area where visitors can view Picasso’s Guernica. 
Each visitor must find a seat and may view the painting for as long as they choose. 
Your task is to write a class called ViewingStand that manages access to the seats. 
The class has two methods: findSeat and leaveSeat. 
Seats may not be shared by visitors, i.e. two visitors cannot share the same seat. 
In the event that a seat is not available a visitor simply continues to check for one. 
There is no wait for a seat to become vacant. 
It is important to optimize the search for a seat so that multiple visitors can concurrently search for seats. 
Write a simple simulator for your class that uses threads to model visitors. 
Use ReentrantLock with Condition to implement.


