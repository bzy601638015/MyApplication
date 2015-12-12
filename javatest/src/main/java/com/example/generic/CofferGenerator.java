package com.example.generic;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by baozhiyuan on 15/11/28.
 */
public class CofferGenerator implements Generator<Coffee>, Iterator<Coffee> {
    private Class[] types = {
            Latte.class,
            Mocha.class
    };

    private Random mRandom = new Random(47);


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee)types[mRandom.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        CofferGenerator cofferGenerator = new CofferGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(cofferGenerator.next());
        }
    }
}
