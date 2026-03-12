import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);

        Line line = new Line(p1, p2);

        double length = line.calculateLength();

        System.out.println("Length of Line : " + length);
    }
}