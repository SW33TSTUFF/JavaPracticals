import java.util.Date;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int age = 30;
        Date now = new Date();

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);
        // strings are immutable
    }
}

