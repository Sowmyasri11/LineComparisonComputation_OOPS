import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(new Point(2, 3), new Point(4, 5));
        Line line2 = new Line(new Point(2, 3), new Point(4, 5));

        if (line1.equals(line2))
            System.out.println("Lines are Equal");
        else
            System.out.println("Lines are Not Equal");
    }
}