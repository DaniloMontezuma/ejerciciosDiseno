package Ejercicio3;

import java.util.ArrayList;

class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String DNI;
    protected String direccion;
    protected int antiguedad;
    protected String telefono;
    protected double salario;
    protected Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = 0;
    }

    public void cambiarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void incrementarSalario() {
        this.salario *= 1.03; 
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("DNI: " + DNI);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.nombre + " " + supervisor.apellidos);
        }
    }
}

class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.05; 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Secretario");
        System.out.println("Despacho: " + despacho);
        System.out.println("Fax: " + fax);
    }
}

class Vendedor extends Empleado {
    private String matriculaCoche;
    private String marcaCoche;
    private String modeloCoche;
    private String areaVenta;
    private ArrayList<String> clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String matriculaCoche, String marcaCoche, String modeloCoche, String areaVenta, double comision) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
        this.areaVenta = areaVenta;
        this.clientes = new ArrayList<>();
        this.comision = comision;
    }

    public void darAltaCliente(String cliente) {
        clientes.add(cliente);
    }

    public void darBajaCliente(String cliente) {
        clientes.remove(cliente);
    }

    public void cambiarCoche(String matricula, String marca, String modelo) {
        this.matriculaCoche = matricula;
        this.marcaCoche = marca;
        this.modeloCoche = modelo;
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.10; 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Vendedor");
        System.out.println("Coche: " + marcaCoche + " " + modeloCoche + " (Matrícula: " + matriculaCoche + ")");
        System.out.println("Área de Venta: " + areaVenta);
        System.out.println("Comisión: " + comision);
        System.out.println("Clientes: " + clientes);
    }
}

class JefeDeZona extends Vendedor {
    private Secretario secretario;
    private ArrayList<Vendedor> vendedores;

    public JefeDeZona(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String matriculaCoche, String marcaCoche, String modeloCoche, String areaVenta, double comision) {
        super(nombre, apellidos, DNI, direccion, telefono, salario, matriculaCoche, marcaCoche, modeloCoche, areaVenta, comision);
        this.vendedores = new ArrayList<>();
    }

    public void cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void darAltaVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void darBajaVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.20; 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Jefe de Zona");
        if (secretario != null) {
            System.out.println("Secretario: " + secretario.nombre + " " + secretario.apellidos);
        }
        System.out.println("Vendedores a cargo: " + vendedores.size());
    }
}