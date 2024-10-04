package Ejer4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create a Cat:");
        System.out.print("Enter cat's name: ");
        String catName = scanner.nextLine();
        Cat cat = new Cat(catName);
        System.out.println(cat);
        cat.greets();

        System.out.println("\nCreate a Dog:");
        System.out.print("Enter dog's name: ");
        String dogName = scanner.nextLine();
        Dog dog = new Dog(dogName);
        System.out.println(dog);
        dog.greets();

        System.out.println("\nCreate another Dog to greet the first dog:");
        System.out.print("Enter the second dog's name: ");
        String anotherDogName = scanner.nextLine();
        Dog anotherDog = new Dog(anotherDogName);
        System.out.println(anotherDog);
        dog.greets(anotherDog);

        scanner.close();
    }
}
