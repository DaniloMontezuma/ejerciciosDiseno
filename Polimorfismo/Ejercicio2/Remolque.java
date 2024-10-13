package Ejercicio2;

//Clase Remolque
class Remolque {
 private int peso;

 public Remolque(int peso) {
     this.peso = peso;
 }

 @Override
 public String toString() {
     return "Remolque de " + peso + " kg";
 }
}

//Clase abstracta Vehiculo
abstract class Vehiculo {
 protected String matricula;
 protected int velocidad;

 public Vehiculo(String matricula) {
     this.matricula = matricula;
     this.velocidad = 0;
 }

 public void acelerar(int incremento) {
     velocidad += incremento;
 }

 @Override
 public String toString() {
     return "Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h";
 }
}

class Coche extends Vehiculo {
 private int numPuertas;

 public Coche(String matricula, int numPuertas) {
     super(matricula);
     this.numPuertas = numPuertas;
 }

 public int getNumPuertas() {
     return numPuertas;
 }

 @Override
 public String toString() {
     return super.toString() + ", Número de puertas: " + numPuertas;
 }
}

class Camion extends Vehiculo {
 private Remolque remolque;

 public Camion(String matricula) {
     super(matricula);
     this.remolque = null; 
 }

 public void ponRemolque(Remolque remolque) {
     this.remolque = remolque;
 }

 public void quitaRemolque() {
     this.remolque = null;
 }

 @Override
 public void acelerar(int incremento) {
     super.acelerar(incremento);
     if (remolque != null && velocidad > 100) {
         System.out.println("El camión de remolque excede la velocidad usual.");
     }
 }

 @Override
 public String toString() {
     String info = super.toString();
     if (remolque != null) {
         info += ", " + remolque.toString();
     }
     return info;
 }
}
