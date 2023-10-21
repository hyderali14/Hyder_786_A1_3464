import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Circle {
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double surface() {
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean isInternal(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2));
        return distance <= radius;
    }
}

public class CircleArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Circle objects
        Circle[] circles = new Circle[3];

        // Input data for the circles
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Enter the radius for Circle " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            System.out.println("Enter the x-coordinate for the center of Circle " + (i + 1) + ": ");
            double x = scanner.nextDouble();
            System.out.println("Enter the y-coordinate for the center of Circle " + (i + 1) + ": ");
            double y = scanner.nextDouble();

            Point center = new Point(x, y);
            circles[i] = new Circle(radius, center);
        }

        // Input a point
        System.out.println("Enter a point's x-coordinate: ");
        double pointX = scanner.nextDouble();
        System.out.println("Enter a point's y-coordinate: ");
        double pointY = scanner.nextDouble();

        // Check if the point is inside each circle and print surface area
        for (int i = 0; i < circles.length; i++) {
            boolean isInside = circles[i].isInternal(pointX, pointY);
            double surface = circles[i].surface();

            System.out.println("Circle " + (i + 1) + ":");
            System.out.println("Surface Area: " + surface);
            if (isInside) {
                System.out.println("The point is inside this circle.");
            } else {
                System.out.println("The point is outside this circle.");
            }
        }

        scanner.close();
    }
}



