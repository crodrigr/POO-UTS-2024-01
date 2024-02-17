public class Estudiante {

    private String nombre;
    private int edad;
    private int numeroIdentificacion;
    private double nota;

    public Estudiante(String nombre, int edad, int numeroIdentificacion, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", ID: " + numeroIdentificacion + ", Nota: " + nota;
    }
    
}
