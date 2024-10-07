package Enun_2;

public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("", "", "", "", "", "", "");

        System.out.println("Ingrese los datos de la dirección:");
        direccion.nuevo_nombre();
        direccion.nueva_direccion();

        System.out.println("\nDatos completos:");
        direccion.mostrar();
    }
}
