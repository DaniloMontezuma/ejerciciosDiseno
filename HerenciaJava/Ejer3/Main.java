package Ejer3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interacción para Circle
        System.out.println("Create a Circle:");
        System.out.print("Enter radius: ");
        double circleRadius = scanner.nextDouble();
        System.out.print("Enter color: ");
        String circleColor = scanner.next();
        System.out.print("Is filled (true/false): ");
        boolean circleFilled = scanner.nextBoolean();
        
        Circle circle = new Circle(circleRadius, circleColor, circleFilled);
        System.out.println(circle);

        // Interacción para Rectangle
        System.out.println("\nCreate a Rectangle:");
        System.out.print("Enter width: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Enter length: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter color: ");
        String rectangleColor = scanner.next();
        System.out.print("Is filled (true/false): ");
        boolean rectangleFilled = scanner.nextBoolean();
        
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleLength, rectangleColor, rectangleFilled);
        System.out.println(rectangle);

        // Interacción para Square
        System.out.println("\nCreate a Square:");
        System.out.print("Enter side: ");
        double squareSide = scanner.nextDouble();
        System.out.print("Enter color: ");
        String squareColor = scanner.next();
        System.out.print("Is filled (true/false): ");
        boolean squareFilled = scanner.nextBoolean();
        
        Square square = new Square(squareSide, squareColor, squareFilled);
        System.out.println(square);

        scanner.close();
    }
}

