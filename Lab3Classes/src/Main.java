public class Main {
    public static void main(String[] args) {

        Point spot = new Point();
        spot.printInfo();
        spot.move(5,8);
        spot.printInfo();
        spot.move();
        spot.printInfo();

        Rectangle priamougolnik = new Rectangle(8,3);
        priamougolnik.printInfo();
        priamougolnik.move();
        priamougolnik.printInfo();
    }
}
