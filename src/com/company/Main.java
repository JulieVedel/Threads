package com.company;

public class Main {

    public static void main(String[] args) {
        makeThreads(13);
    }

    public static void makeThreads(int input) {
        for (int i = 1; i <= input; i++) {
            MultiThreads thread = new MultiThreads(i);
            thread.run();
        }
    }
}
