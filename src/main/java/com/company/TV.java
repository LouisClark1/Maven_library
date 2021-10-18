package com.company;

public class TV extends DVDs{

    /////////////////////////////Attributes////////////////////////

    /////////////////////////////Constructors//////////////////////
    public TV(){
        this("Default TV show name",000000000);
    }
    public TV(String name) {
        super(name);
    }
    public TV(String name, double itemSize) {
        super(name,itemSize);
        //this.itemSize = itemSize;
    }


    //////////////////////////////Methods//////////////////////////

}
