package com.example.generic;

import java.awt.Color;

/**
 * Created by baozhiyuan on 15/11/29.
 */
public class Bounded extends Dimension implements HasColor,Weight {
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }

    public static void main(String[] args){
        Solid<Bounded> solid = new Solid<>(new Bounded());
        System.out.println(solid.color());
        System.out.println(solid.weight());
        System.out.println(solid.getX());
    }
}
