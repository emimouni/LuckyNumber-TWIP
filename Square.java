package com.company;

/**
 * Created by emimo on 10/12/2016.
 */
public class Square {
    public int usersNumber;

    public Square(){

    }
    public double perfectRandom(){
        double i = Math.random()*1000;
        usersNumber = (int)i;
        usersNumber = (int)Math.pow(usersNumber,2);
        return usersNumber;
    }
}
