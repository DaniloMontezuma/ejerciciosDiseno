package HerenciaJava_Enunciados;

class Publicacion {
    private String titulo;
    private float precio;

    public Publicacion() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void solicitarDatos() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese el título: ");
        setTitulo(sc.nextLine());
        System.out.print("Ingrese el precio: ");
        setPrecio(sc.nextFloat());
    }

    public void mostrar() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Precio: " + getPrecio());
    }
}
