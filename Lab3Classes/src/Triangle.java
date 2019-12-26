public class Triangle extends Rhomb {

    // FIELDS
    private double angle02;
    private double angle03;

    // GETTERS/SETTERS
    public double getSecondAngle() {return angle02;}
    public void setSecondAngle(double angle02) {this.angle02 = angle02;}
    public double getThirdAngle() {return angle03;}
    public void setThirdAngle(double angle03) {this.angle03 = angle03;}

    // CONSTRUCTORS
    public Triangle(double coordX, double coordY, double length, double firstAngle, double secondAngle) {
        super(coordX, coordY, length, firstAngle);
        setSecondAngle(secondAngle);
        setThirdAngle(180.00 - firstAngle - secondAngle);
    }
    public Triangle(double length, double firstAngle, double secondAngle) {
        super(length, firstAngle);
        setSecondAngle(secondAngle);
        setThirdAngle(180.00 - firstAngle - secondAngle);
    }
    public Triangle(double length, double firstAngle) {
        super(length, firstAngle);
        setSecondAngle((180.00 - firstAngle) / 2.0);
        setThirdAngle(getSecondAngle());
    }
    public Triangle(double firstAngle) {
        super();
        setSecondAngle((180.00 - firstAngle) / 2.0);
        setThirdAngle(getSecondAngle());
    }
    public Triangle() {
        super();
        setSecondAngle((180.00 - getFirstAngle()) / 2.0);
        setThirdAngle(getSecondAngle());
    }

    // METHODS
    @Override
    public void printInfo() {
        System.out.println("\nClass " + className() +
                ".\nFirst side length: " + getLength01() +
                "\nStart point in:\n\tX: " + getCoordX() +
                ";\n\tY: " + getCoordY() + "\nAngle 1: " + getFirstAngle() +
                "\nAngle 2: " + getSecondAngle() +
                "\nAngle 3: " + getThirdAngle());
    }
    // MOVE method inherited from POINT class
    @Override
    public void scale(double scale) {
        setLength01(getLength01() * scale);
        System.out.println("\nThe side of " + className() + " is changed to " + getLength01());
    }
}
