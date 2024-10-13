package Ejercicio3;

public class EmpresaTest {
    public static void main(String[] args) {
        Secretario sec = new Secretario("Carlos", "Lopez", "12345678A", "Carrera 27 #18-35, Pasto", "123456789", 1500, "101", "987654321");
        Vendedor vend = new Vendedor("Ana", "Ramirez", "87654321B", "Calle 15 #12-20, Pasto", "987654321", 2000, "ABC123", "Toyota", "Corolla", "Nariño", 0.05);
        JefeDeZona jefe = new JefeDeZona("Luis", "Martinez", "45678912C", "Avenida Las Américas #22-15, Pasto", "654321987", 3000, "XYZ987", "Chevrolet", "Spark", "Sur de Colombia", 0.10);

        vend.cambiarSupervisor(jefe);
        jefe.cambiarSecretario(sec);

        sec.imprimir();
        System.out.println();
        vend.imprimir();
        System.out.println();
        jefe.imprimir();
    }
}

