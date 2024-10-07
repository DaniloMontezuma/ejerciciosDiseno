package Enun_2;

class Direccion extends Nombre {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad, String provincia, String codigoPostal) {
        super(nombre, primerApellido, segundoApellido);
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    public void nueva_direccion() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese la calle: ");
        this.calle = sc.nextLine();
        System.out.print("Ingrese la ciudad: ");
        this.ciudad = sc.nextLine();
        System.out.print("Ingrese la provincia: ");
        this.provincia = sc.nextLine();
        System.out.print("Ingrese el código postal: ");
        this.codigoPostal = sc.nextLine();
    }

    public void nuevo_nombre() {
        super.Leer_nombre(); // Llama al método Leer_nombre de la clase base
    }

    @Override
    public void mostrar() {
        super.mostrar(); // Muestra el nombre completo
        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", " + codigoPostal);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
