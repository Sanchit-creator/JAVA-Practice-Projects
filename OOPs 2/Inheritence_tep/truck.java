package Inheritence_tep;

import Inheritence_src.vehicle;

public class truck extends vehicle{
    int maxLoading;
    public void print() {
        System.out.println("Vehicle " + getColor() + " Max Speed " + maxSpeed + " Ma loading Capacity " + maxLoading);
    }
}
