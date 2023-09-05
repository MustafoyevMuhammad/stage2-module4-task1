package com.mjc.stage2;

import java.util.concurrent.atomic.AtomicReference;

public class ThreadSafeSingleton {
    // Write your code here!
    private static final AtomicReference<ThreadSafeSingleton> instance = new AtomicReference<>();

    private ThreadSafeSingleton() {
    }


    public static ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton result = instance.get();
        if (result == null) {
            result = new ThreadSafeSingleton();
            if (instance.compareAndSet(null, result)) {
            } else {
                result = instance.get();
            }
        }
        return result;

    }
}
