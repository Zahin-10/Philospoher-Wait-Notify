package com.uri;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stick[] sticks = new Stick[5];
        sticks[0] = new Stick();
        sticks[1] = new Stick();
        sticks[2] = new Stick();
        sticks[3] = new Stick();
        sticks[4] = new Stick();

        Philosopher p1 = new Philosopher(1,sticks[0],sticks[1]);
        Philosopher p2 = new Philosopher(2,sticks[1],sticks[2]);
        Philosopher p3 = new Philosopher(3,sticks[2],sticks[3]);
        Philosopher p4 = new Philosopher(4,sticks[3],sticks[4]);
        Philosopher p5 = new Philosopher(5,sticks[4],sticks[0]);
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        new Thread(p5).start();
    }
}
