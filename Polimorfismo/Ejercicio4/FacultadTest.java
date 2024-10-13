package Ejercicio4;

public class FacultadTest {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "Perez", "123456789", "Soltero", "Ingeniería de Sistemas");
        Profesor profesor = new Profesor("Ana", "Gomez", "987654321", "Casada", 2010, "D-202", "Matemáticas");
        PersonalDeServicio personal = new PersonalDeServicio("Luis", "Ramirez", "111222333", "Viudo", 2015, "S-101", "Biblioteca");

        estudiante.imprimirInformacion();
        System.out.println();
        profesor.imprimirInformacion();
        System.out.println();
        personal.imprimirInformacion();
        
        estudiante.matricularCurso("Ingeniería de Software");
        profesor.cambiarDepartamento("Física");
        personal.trasladarSeccion("Decanato");


        System.out.println("\nDespués de los cambios:\n");
        estudiante.imprimirInformacion();
        System.out.println();
        profesor.imprimirInformacion();
        System.out.println();
        personal.imprimirInformacion();
    }
}
