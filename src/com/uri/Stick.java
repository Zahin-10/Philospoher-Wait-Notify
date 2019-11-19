package com.uri;

public class Stick {

    boolean isAvailable;

    Stick (){
        this.isAvailable = true;
    }

    public  synchronized void pick() throws InterruptedException {

        while(!this.isAvailable){
            wait();
        }

        this.isAvailable = false;
    }

    public synchronized void drop() throws InterruptedException{
        this.isAvailable = true;
        notifyAll();
    }
}
