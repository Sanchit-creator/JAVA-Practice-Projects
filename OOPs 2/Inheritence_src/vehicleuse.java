package Inheritence_src;

public class vehicleuse {
    public static void main(String[] args) {

        //Polymorfism

        // vehicle v = new car(10);

        // v.maxSpeed = 100;

        // Object 
        // when we use it and type v. it will show many functions in it

        // Object o = new vehicle();
        // vehicle v = new vehicle();

        vehicle v2 = new bicycle();


        vehicle v = new vehicle();
        v.setColor("Red");
        v.print();

        car c = new car(10);
        c.setColor("Black");
        c.maxSpeed = 100;
        c.numDoors = 4;
        c.printCar();
    }
}
