public abstract class vehicle {
    private String color;
    protected int maxSpeed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void print() {
        System.out.println("Vehicle " + color + " Max Speed " + maxSpeed);
    }

    public abstract boolean isMotorised();
    public abstract String getCompany();
}
