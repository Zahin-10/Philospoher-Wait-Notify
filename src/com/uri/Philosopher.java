package com.uri;

public class Philosopher implements Runnable {

    Stick left,right;
    int id;

    Philosopher(int id, Stick left, Stick right){
        this.id = id;
        this.left = left;
        this.right = right;
    }
    @Override
    public void run() {
        try{
            while(true){

                this.left.pick();
                if(this.right.isAvailable){
                    this.right.pick();
                    this.eat();
                    this.left.drop();
                    this.right.drop();
                }else{
                    this.left.drop();
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void eat(){
//        try{
//            Thread.sleep(1000);
//            System.out.println("Eating id : " + this.id);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        System.out.println("Eating id : " + this.id);

    }
}
