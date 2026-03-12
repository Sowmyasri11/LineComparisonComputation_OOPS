import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(new Point(1, 2), new Point(3, 4));
        Line line2 = new Line(new Point(5, 6), new Point(7, 8));

        int result = line1.compareTo(line2);

        if (result == 0)
            System.out.println("Lines are Equal");
        else if (result > 0)
            System.out.println("Line1 is Greater");
        else
            System.out.println("Line1 is Smaller");
    }
}