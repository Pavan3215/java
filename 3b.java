import java.util.Scanner;

interface RectangleArea {
    void rectangleArea(double length, double breadth);
}

interface TriangleArea {
    void triangleArea(double base, double height);
}

class AreaCalculator implements RectangleArea, TriangleArea {
    public void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void triangleArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class Prog3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.print("Enter length and breadth of rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        calc.rectangleArea(length, breadth);

        System.out.print("Enter base and height of triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        calc.triangleArea(base, height);

        scanner.close();
    }
}
