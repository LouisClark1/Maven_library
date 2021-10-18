package com.company;

public class Digital extends Audiobook implements isAvalible{

    /////////////////////////////Attributes////////////////////////
    private double dataSize;
    /////////////////////////////Constructors//////////////////////
    public Digital(){
        this("Default digital audiobook title",0.0);
    }
    public Digital(String name) {
        super(name);
    }
    public Digital(String name, double dataSize){
        super(name);
        this.dataSize = dataSize;
    }



    //////////////////////////////Methods//////////////////////////


    public double getDataSize() {
        return dataSize;
    }
    public void setDataSize(double dataSize) {
        this.dataSize = dataSize;
    }

    @Override
    public String checkAvalibility() {
        System.out.println("You can take this out of the library");
        String message = "You can take this out of the library";
        return message;
    }

}
