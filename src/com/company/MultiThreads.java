package com.company;

public class MultiThreads extends Thread implements Runnable{
    int number;

    public MultiThreads(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Hallo, Jeg hedder Thread #" + number);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
