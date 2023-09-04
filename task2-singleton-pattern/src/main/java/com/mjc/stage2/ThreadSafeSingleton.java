package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
    static class ThreadSafeHelper{
        private final static ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance() {
        return ThreadSafeHelper.INSTANCE;
    }
}
