public class Rhomb extends Square {

    // FIELDS
    private double angle01;

    // GETTERS/SETTERS
    public double getFirstAngle() {return angle01;}
    public void setFirstAngle(double firstAngle) {this.angle01 = firstAngle;}

    // CONSTRUCTORS
    public Rhomb(double coordX, double coordY, double length, double firstAngle) {super(coordX, coordY, length); setFirstAngle(firstAngle);}
    public Rhomb(double length, double firstAngle) {super(length); setFirstAngle(firstAngle);}
    public Rhomb(double firstAngle) {super(); setFirstAngle(firstAngle);}
    public Rhomb() {super(); setFirstAngle(60.00);}

    // METHODS
    private double getSecondAngle() {return 180.00 - getFirstAngle();}

    @Override
    public void printInfo() {
        System.out.println("\nClass " + className() +
                ".\nSide length: " + getLength01() +
                "\nStart point in:\n\tX: " + getCoordX() +
                ";\n\tY: " + getCoordY() + "\nAngles 1, 3: " + getFirstAngle() +
                "\nAngles 2, 4: " + getSecondAngle());
    }
    // MOVE method inherited from POINT class
    @Override
    public void scale(double scale) {
        setLength01(getLength01() * scale);
        System.out.println("\nThe side of " + className() + " is changed to " + getLength01());
    }
}