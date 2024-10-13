package Ejercicio2;

public class Main {
public static void main(String[] args) {
   Coche coche = new Coche("ABC123", 4);
   Camion camion = new Camion("DEF456");

   System.out.println(coche);
   coche.acelerar(60);
   System.out.println(coche);

   System.out.println(camion);
   camion.acelerar(90);
   System.out.println(camion);

   Remolque remolque = new Remolque(500);
   camion.ponRemolque(remolque);
   camion.acelerar(20); 
   System.out.println(camion);
}
}
