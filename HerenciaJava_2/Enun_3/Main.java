package Enun_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CilindroHueco cilindroHueco = new CilindroHueco();
        cilindroHueco.LeerDatos();
        
        System.out.println("Área del cilindro hueco: " + cilindroHueco.Area());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.Volumen());
        
        Cilindro cilindro = new Cilindro();
        cilindro.LeerDatos();
        
        System.out.println("Área del cilindro: " + cilindro.Area());
        System.out.println("Volumen del cilindro: " + cilindro.Volumen());
        
        Circulo circulo = new Circulo();
        circulo.LeerRadio();
        
        System.out.println("Área del círculo: " + circulo.Area());
        System.out.println("Circunferencia del círculo: " + circulo.Circunferencia());
    }
}
