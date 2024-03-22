public class Estudiante {

    private String nombre;
    private int edad;
    private int numeroIdentificacion;
    private double nota;

    public Estudiante(){
        
    }

    public Estudiante(String nombre, int edad, int numeroIdentificacion, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", ID: " + numeroIdentificacion + ", Nota: " + nota;
    }
    
}
