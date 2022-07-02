package prac1;

public class vehicleuse {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.setColor("red");
        v.maxSpeed = 80;
        v.print();

        car c = new car();
        c.setColor("black");
        c.maxSpeed = 100;
        c.numDoors = 4;
        // c.print();
        c.printCar();

        bike b = new bike();
        b.print();
    }
}
