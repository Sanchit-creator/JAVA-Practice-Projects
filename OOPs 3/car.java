public abstract class car extends vehicle{
    int numDoors;

    // constructor
    public car(int numDoors) {
        this.numDoors = numDoors;
    }
    
    // if we use super keyword here super.print() it will going to call print function of parent class(vehicle class)

    public void printCar() {
        System.out.println("Vehicle " + getColor() + " Max Speed " + maxSpeed + " Number of Doors " + numDoors);
    }

    @Override
    public boolean isMotorised() {
        return true;
    }
}