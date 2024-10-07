package HerenciaJava_Enunciados;

class Disco extends Publicacion {
    private float duracion;
    private float precio; // Cambiado a float para ser consistente con Publicacion

    public Disco() {}

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    // Ya no es necesario sobrescribir setPrecio() y getPrecio(), ya que son consistentes con Publicacion
    @Override
    public void solicitarDatos() {
        super.solicitarDatos(); // Llama a solicitarDatos() de Publicacion
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese la duración en minutos: ");
        setDuracion(sc.nextFloat());
    }

    @Override
    public void mostrar() {
        super.mostrar(); // Llama a mostrar() de Publicacion
        System.out.println("Duración: " + getDuracion() + " minutos");
    }
}
