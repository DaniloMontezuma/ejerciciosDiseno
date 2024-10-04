package Ejer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius for Circle: ");
        double circleRadius = scanner.nextDouble();
        System.out.print("Enter color for Circle: ");
        String circleColor = scanner.next();
        
        Circle circle = new Circle(circleRadius, circleColor);
        System.out.println("Created Circle: " + circle);
        System.out.println("Circle Area: " + circle.getArea());

        System.out.print("Enter radius for Cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter height for Cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        System.out.print("Enter color for Cylinder: ");
        String cylinderColor = scanner.next();

        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight, cylinderColor);
        System.out.println("Created Cylinder: " + cylinder);
        System.out.println("Cylinder Volume: " + cylinder.getVolume());

        scanner.close();
    }
}
