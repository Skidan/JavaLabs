//public class Rhomb extends Square {
//    // FIELDS
//    private double firstAngle;
//    private double secondAngle;
//
//    // GETTERS/SETTERS
//    public double getFirstAngle() {
//        return firstAngle;
//    }
//    public double getSecondAngle() {
//        return secondAngle;
//    }
//    public void setFirstAngle(double firstAngle) {
//        this.firstAngle = firstAngle;
//    }
//
//    // CONSTRUCTORS
//    public Rhomb(double length, double firstAngle) {
//        super(length);
//        this.firstAngle = firstAngle;
//        this.secondAngle = 180.00 - firstAngle;
//    }
//    public Rhomb(double firstAngle) {
//        super();
//        this.firstAngle = firstAngle;
//        this.secondAngle = 180.00 - firstAngle;
//    }
//    public Rhomb() {
//        super();
//        this.firstAngle = 120.00;
//        this.secondAngle = 180.00 - firstAngle;
//    }
//
//    // METHODS
//    @Override
//    public void printInfo() {
//        System.out.println("\nClass " + getClassName() + ".\nRhomb with side of " + getLength() + "\nStart point in:\n\tX: " + getCoordX() + ";\n\tY: " + getCoordY() + "\nAngles 1, 3: " + getFirstAngle() + "\nAngles 2, 4: " + getSecondAngle());
//    }
//
//    @Override
//    public void changeSize(double angle) {
//        //setLength(length);
//        firstAngle = angle;
//        secondAngle = 180.00 - angle;
//        System.out.println("\nThe side of rhomb is changed to " + getLength() + "\nAngles 1, 3: " + getFirstAngle() + "\nAngles 2, 4: " + getSecondAngle());
//        super.changeSize(23);
//    }
//}