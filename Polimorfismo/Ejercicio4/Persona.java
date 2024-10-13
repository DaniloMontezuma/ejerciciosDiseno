package Ejercicio4;

class Persona {
    protected String nombre;
    protected String apellidos;
    protected String identificacion;
    protected String estadoCivil;

    public Persona(String nombre, String apellidos, String identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstado) {
        this.estadoCivil = nuevoEstado;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}

class Empleado extends Persona {
    protected int añoIncorporacion;
    protected String numeroDespacho;

    public Empleado(String nombre, String apellidos, String identificacion, String estadoCivil, int añoIncorporacion, String numeroDespacho) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reAsignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Año de Incorporación: " + añoIncorporacion);
        System.out.println("Número de Despacho: " + numeroDespacho);
    }
}

class Estudiante extends Persona {
    private String cursoMatriculado;

    public Estudiante(String nombre, String apellidos, String identificacion, String estadoCivil, String cursoMatriculado) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public void matricularCurso(String nuevoCurso) {
        this.cursoMatriculado = nuevoCurso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso Matriculado: " + cursoMatriculado);
    }
}

class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String identificacion, String estadoCivil, int añoIncorporacion, String numeroDespacho, String departamento) {
        super(nombre, apellidos, identificacion, estadoCivil, añoIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Departamento: " + departamento);
    }
}

class PersonalDeServicio extends Empleado {
    private String seccionAsignada;

    public PersonalDeServicio(String nombre, String apellidos, String identificacion, String estadoCivil, int añoIncorporacion, String numeroDespacho, String seccionAsignada) {
        super(nombre, apellidos, identificacion, estadoCivil, añoIncorporacion, numeroDespacho);
        this.seccionAsignada = seccionAsignada;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        this.seccionAsignada = nuevaSeccion;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección Asignada: " + seccionAsignada);
    }
}
