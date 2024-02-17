import java.util.ArrayList;
import java.util.Scanner;

public class App {
     private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearEstudiante();
                    break;
                case 2:
                    calcularPromedio();
                    break;
                case 3:
                    listarEstudiantesConNotaMenorATres();
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción correcta.");
            }
        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Crear Estudiante");
        System.out.println("2. Calcular Promedio");
        System.out.println("3. Listar Estudiantes con Nota por Debajo de 3");
        System.out.println("4. Salir");
    }

    private static void crearEstudiante() {
        System.out.println("\n--- Crear Estudiante ---");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el número de identificación del estudiante: ");
        int numeroIdentificacion = scanner.nextInt();

        System.out.print("Ingrese la nota del estudiante (entre 0 y 5): ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 5) {
            System.out.println("La nota ingresada no es válida. Debe estar en el rango de 0 a 5.");
            return;
        }

        Estudiante estudiante = new Estudiante(nombre, edad, numeroIdentificacion, nota);
        listaEstudiantes.add(estudiante);
        System.out.println("Estudiante creado exitosamente.");
    }

    private static void calcularPromedio() {
        System.out.println("\n--- Calcular Promedio ---");
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes ingresados.");
            return;
        }

        double sumaNotas = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            sumaNotas += estudiante.getNota();
        }

        double promedio = sumaNotas / listaEstudiantes.size();
        System.out.println("El promedio de las notas de los estudiantes es: " + promedio);
    }

    private static void listarEstudiantesConNotaMenorATres() {
        System.out.println("\n--- Listar Estudiantes con Nota por Debajo de 3 ---");
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes ingresados.");
            return;
        }

        System.out.println("Estudiantes con nota por debajo de 3:");
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getNota() < 3) {
                System.out.println(estudiante.toString());
            }
        }
    }
}
