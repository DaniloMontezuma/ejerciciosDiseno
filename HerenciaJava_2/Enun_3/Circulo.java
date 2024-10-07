package Enun_3;

import java.util.Scanner;

public class Circulo {
    protected double radio;

    public void LeerRadio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio: ");
        this.radio = scanner.nextDouble();
    }

    public double Area() {
        return Math.PI * Math.pow(radio, 2); // A = πr²
    }

    public double Circunferencia() {
        return 2 * Math.PI * radio; // L = 2πr
    }
}

