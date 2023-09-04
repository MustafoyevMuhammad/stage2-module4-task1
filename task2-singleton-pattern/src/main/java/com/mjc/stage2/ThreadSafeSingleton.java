package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
    private static volatile ThreadSafeSingleton insteace;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (insteace == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (insteace == null) {
                    insteace = new ThreadSafeSingleton();
                }
            }
        }
        return insteace;
    }
}
