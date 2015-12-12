package com.example.generic;

/**
 * Created by baozhiyuan on 15/11/29.
 */
public class ColoredDimension<T extends Dimension & HasColor> {

    T item;

    ColoredDimension(T item){
        this.item = item;
    }

    T getItem(){
        return item;
    }

    java.awt.Color color(){ return item.getColor();}

    int getX(){return item.x;}

    int getY(){return item.y;}

    int getZ(){return item.z;}

}
