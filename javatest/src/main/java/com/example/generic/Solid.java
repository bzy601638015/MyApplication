package com.example.generic;

/**
 * Created by baozhiyuan on 15/11/29.
 */
public class Solid<T extends Dimension & HasColor  & Weight> {
    T item;
    Solid (T item){
        this.item = item;
    }

    java.awt.Color color(){return item.getColor();}

    int getX(){return item.x;}

    int getY(){return item.y;}

    int getZ(){return item.z;}

    int weight(){return item.weight();}

}
