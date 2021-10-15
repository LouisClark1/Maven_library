package com.company;

public class Films extends DVDs implements isAvalible{

    /////////////////////////////Attributes////////////////////////

    /////////////////////////////Constructors//////////////////////
    public Films(){
        this("Default film title", 0000000000);
    }
    public Films(String name) {
        super(name);
    }

    public Films(String name, double itemSize) {
        super(name, itemSize);
        //this.itemSize = itemSize;
    }

    //////////////////////////////Methods//////////////////////////

    @Override
    public void checkAvalibility() {
        System.out.println("You can take this out of the library");
    }

}
