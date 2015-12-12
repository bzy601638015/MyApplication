package com.example;

import com.example.generic.Coffee;

public class MyClass {

    public static void main(String[] args){
        System.out.println("hello java ");
        try {
            Class clz = Class.forName("com.example.generic.Latte");
            Coffee coffee = (Coffee) clz.newInstance();
            System.out.println(coffee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
