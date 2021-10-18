package com.company;


public abstract class DVDs extends Library_item{

    /////////////////////////////Attributes////////////////////////
    private double itemSize;
    /////////////////////////////Constructors//////////////////////


    public DVDs(String name) {
        super(name);
    }

    public DVDs(String name, double itemSize){
        super(name);
        this.itemSize = itemSize;
    }
    //////////////////////////////Methods//////////////////////////

    public double getItemSize() {
        return itemSize;
    }
    public void setItemSize(double itemSize) {
        this.itemSize = itemSize;
    }



}
