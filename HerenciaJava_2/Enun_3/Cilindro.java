package Enun_3;

import java.util.Scanner;

public class Cilindro extends Circulo {
    protected double altura;

    public void LeerDatos() {
        LeerRadio();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del cilindro: ");
        this.altura = scanner.nextDouble();
    }

    public double Area() {
        return 2 * Math.PI * radio * altura + 2 * Area(); // A = 2πrh + 2πr²
    }

    public double Volumen() {
        return Area() * altura; // V = πr²h
    }
}
