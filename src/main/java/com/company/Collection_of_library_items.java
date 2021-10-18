package com.company;

public abstract class Collection_of_library_items {

    /////////////////////////////Attributes////////////////////////
    private String name;
    /////////////////////////////Constructors//////////////////////
    public Collection_of_library_items(String name){
        this.name = name;
    }
    //////////////////////////////Methods//////////////////////////

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
