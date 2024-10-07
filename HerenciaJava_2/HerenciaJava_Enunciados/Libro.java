package HerenciaJava_Enunciados;

class Libro extends Publicacion {
    private int numPaginas;
    private int año;
    private float precio;

    public Libro() {}

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public void solicitarDatos() {
        super.solicitarDatos();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese el número de páginas: ");
        setNumPaginas(sc.nextInt());
        System.out.print("Ingrese el año de publicación: ");
        setAño(sc.nextInt());
        System.out.print("Ingrese el precio del libro: ");
        setPrecio(sc.nextFloat());
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de páginas: " + getNumPaginas());
        System.out.println("Año de publicación: " + getAño());
        System.out.println("Precio del libro: " + getPrecio());
    }
}
