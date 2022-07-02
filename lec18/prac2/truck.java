package prac2;

import prac1.vehicle;

public class truck extends vehicle{
    int maxsLoadingCapacity;

    public void print(){
        System.out.println("Vehicle " + "color " + getColor() + "maxspeed " + maxSpeed + "maxsLoadingCapacity" + maxsLoadingCapacity);
    }

}
