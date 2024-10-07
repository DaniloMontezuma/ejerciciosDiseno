package Enun_3;

import java.util.Scanner;

public class CilindroHueco extends Cilindro {
    private double radioInterno;

    public void LeerDatos() {
        super.LeerDatos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio interno del cilindro hueco: ");
        this.radioInterno = scanner.nextDouble();
    }

    @Override
    class CilindroHueco extends Cilindro {
        // Suponiendo que tiene atributos como radioInterior y radioExterior

        public double Area() {
            // Si necesitas calcular el área, asegúrate de hacerlo correctamente
            if (radioInterior < 0 || radioExterior < 0) {
                throw new IllegalArgumentException("Los radios no pueden ser negativos");
            }
            // Aquí calcula el área del cilindro hueco
            double areaExterior = 2 * Math.PI * radioExterior * altura;
            double areaInterior = 2 * Math.PI * radioInterior * altura;
            return areaExterior - areaInterior; // Área de la superficie lateral
        }
    }
    public double Volumen() {
        return Math.PI * (Math.pow(radio, 2) - Math.pow(radioInterno, 2)) * altura; // V = π(r_externo² - r_interno²)h
    }
}
