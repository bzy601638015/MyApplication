package com.example.generic;

/**
 * Created by baozhiyuan on 15/11/29.
 */
public class Colored <T extends HasColor> {
    T item;
    Colored(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }

    java.awt.Color color(){return item.getColor();}
}
