package Ejercicio1;

public class Main {
	 public static void main(String[] args) {
	     FiguraGeometrica circulo = new Circulo(5);
	     FiguraGeometrica cuadrado = new Cuadrado(4);
	     FiguraGeometrica rectangulo = new Rectangulo(4, 6);
	     FiguraGeometrica triangulo = new Triangulo(3, 5);
	     FiguraGeometrica cubo = new Cubo(3);

	     System.out.println("Área del círculo: " + circulo.getArea());
	     System.out.println("Perímetro del cuadrado: " + cuadrado.getPerimetro());
	     System.out.println("Área del rectángulo: " + rectangulo.getArea());
	     System.out.println("Área del triángulo: " + triangulo.getArea());
	     System.out.println("Área del cubo: " + cubo.getArea());
	 }
	}