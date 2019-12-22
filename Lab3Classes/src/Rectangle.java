public class Rectangle extends Point {
    // FIELDS
    private double width, height;

    // GETTERS/SETTERS
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // CONSTRUCTORS
    public Rectangle(double length, double height) {
        super(5.0, 6.0);
        this.width = length;
        this.height = height;
    }

    public Rectangle() {
        this(10.0, 20.0);
    }

    // METHODS
    @Override
    public void printInfo() {
        System.out.println("Rectangle's start point coordinates are\n\tX: " + getCoordX() + "\n\tY: " + getCoordY());
        System.out.println("Length: " + this.width + "\nHeight: " + this.height);
    }


}
