package Interface;

public class vehicleUse {
    public static void main(String[] args) {
        vehicle v = new vehicle();

    
    vehicleInterface vi;
// this is ok
    vi = new vehicle();

    // we can access wat ever content here
    // vi.getCompany()


    // but this will not work

    // vi.print();
    }
}
