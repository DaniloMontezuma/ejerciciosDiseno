package Enun_2;

class Nombre {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Nombre(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public void Leer_nombre() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese el primer apellido: ");
        this.primerApellido = sc.nextLine();
        System.out.print("Ingrese el segundo apellido: ");
        this.segundoApellido = sc.nextLine();
    }

    public void mostrar() {
        System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
