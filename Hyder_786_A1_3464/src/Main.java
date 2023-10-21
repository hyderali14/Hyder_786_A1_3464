import java.util.Scanner;
import java.lang.Math;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Triangle{
    Point p1, p2, p3;

    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
}

    double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    double perimeter() {
        return distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
    }

    String type() {
        double a = distance(p1, p2);
        double b = distance(p2, p3);
        double c = distance(p3, p1);

        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || c == a)
            return "Isosceles";
        else
            return "Unknown";
    }
}


