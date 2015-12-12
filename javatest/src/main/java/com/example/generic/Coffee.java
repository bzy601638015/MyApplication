package com.example.generic;

/**
 * Created by baozhiyuan on 15/11/28.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
