# Java
Exercices of Parallel and Distributed Programming in Java.

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


