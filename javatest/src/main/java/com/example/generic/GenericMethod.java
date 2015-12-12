package com.example.generic;

/**
 * Created by baozhiyuan on 15/11/28.
 */
public class GenericMethod {
    public <T> void show(T t){
        System.out.println(t.getClass().getSimpleName());
    }

    public static void main(String[] args){
        GenericMethod gm = new GenericMethod();
        gm.show(1);
        gm.show("a");
        gm.show(gm);
        gm.show('b');
    }
}
